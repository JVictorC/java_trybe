package org.example;

import java.io.*;

public class Exemplo {
  private static final String pathFile = "/Users/joao.csilva/Documents/hello.txt";

  public static void main(String[] args) {
//    File menuFile = new File(pathFile);
//
//
//    boolean arquivoExist = menuFile.exists();
//    boolean podeExecutar = menuFile.canExecute();
//    boolean podeLer = menuFile.canRead();
//    boolean podeEscrever = menuFile.canWrite();
//    boolean deletou = menuFile.delete();
//
//    System.out.println(arquivoExist);
//    System.out.println(podeExecutar);
//    System.out.println(podeLer);
//    System.out.println(podeEscrever);
//    System.out.println(deletou);

    escreverConteudoArquivo();
    lerConteudo();
    listar();
  }

  public static void listar() {
    File menuFile = new File("/Users/joao.csilva/Documents/");

    if(menuFile.isDirectory() && menuFile.canRead()) {
      for (File f : menuFile.listFiles()) {
        System.out.println(f.getName());
      }
    }
  }

  public static void escreverConteudoArquivo() {
    File menuFile = new File(pathFile);
    FileWriter escritorArquivo = null;
    BufferedWriter bufferedWriter = null;

    try {
      escritorArquivo = new FileWriter(menuFile);
      bufferedWriter = new BufferedWriter(escritorArquivo);

      bufferedWriter.write("Oi, estou escrevendo um text no arquivo");
      bufferedWriter.flush();

    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      closeFile(escritorArquivo, bufferedWriter);
    }
  }

  public static void lerConteudo() {
    File menuFile = new File(pathFile);
    FileReader leitorArquivo = null;
    BufferedReader bufferedLeitor = null;

    try {
      if (!menuFile.exists()) {
        if (menuFile.createNewFile()) {
          System.out.println("File Create: " + menuFile.getName());
        }
      }

      leitorArquivo = new FileReader(menuFile);
      bufferedLeitor = new BufferedReader(leitorArquivo);


      String conteudoLinha = bufferedLeitor.readLine();

      while (conteudoLinha != null) {
        System.out.println(conteudoLinha);
        conteudoLinha = bufferedLeitor.readLine();
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      closeFile(leitorArquivo, bufferedLeitor);
    }

  }

  private static void closeFile(FileWriter fileWriter, BufferedWriter bufferedWriter) {
    try {
      fileWriter.close();
      bufferedWriter.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private static void closeFile(FileReader fileReader, BufferedReader bufferedReader) {
    try {
      fileReader.close();
      bufferedReader.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }


}
