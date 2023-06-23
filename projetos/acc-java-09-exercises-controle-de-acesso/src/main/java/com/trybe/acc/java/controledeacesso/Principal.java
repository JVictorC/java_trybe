package com.trybe.acc.java.controledeacesso;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Principal {
  private static final List<Integer> allAges = new ArrayList<Integer>();
  private static Boolean shouldTryAgain = false;

  /**
   * * Método principal.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    do {
      showMenu(scanner);
    } while (shouldTryAgain);
  }

  /**
   * filterArrayListByAge javadoc.
   *
   * @author Some JvictorC.
   */
  private static Stream<Integer> filterArrayByAge(int ageInit, int ageLimit) {
    return allAges.stream().filter(age -> age >= ageInit && age <= ageLimit);
  }

  /**
   * filterArrayListByAge javadoc.
   *
   * @author Some JvictorC.
   */
  private static Stream<Integer> filterArrayByAge(int ageInit) {
    return allAges.stream().filter(age -> age >= ageInit);
  }

  /**
   * showMenu javadoc.
   *
   * @author Some JvictorC.
   */
  private static void showMenu(Scanner scanner) {
    System.out.println("Entre com o número correspondente à opção desejada:");
    System.out.println("1 - Acessar o estabelecimento");
    System.out.println("2 - Finalizar sistema e mostrar relatório");

    int optionSelected = Integer.parseInt(scanner.next());

    switch (optionSelected) {
      case 1:
        enterWithAge(scanner);
        break;
      case 2:
        makeRealatory();
        break;
      default:
        System.out.println("Entre com uma opção válida!");

        shouldTryAgain = true;
    }
  }

  /**
   * enterWithAge javadoc.
   *
   * @author Some JvictorC.
   */
  private static void enterWithAge(Scanner scanner) {
    String message;

    System.out.println("Entre com a sua idade:");

    int newAge = Integer.parseInt(scanner.next());

    if (newAge <= 18) {
      message = "Pessoa cliente menor de idade, catraca liberada!";
    } else if (newAge <= 49) {
      message = "Pessoa adulta, catraca liberada!";
    } else {
      message = "Pessoa adulta a partir de 50, catraca liberada!";
    }

    allAges.add(newAge);

    System.out.println(message);

    shouldTryAgain = true;
  }

  /**
   * makeRealatory javadoc.
   *
   * @author Some JvictorC.
   */
  private static void makeRealatory() {
    System.out.println("----- Quantidade -----");
    System.out.println();

    var sizeAllAges = allAges.size();

    var allBiggerThan18 = filterArrayByAge(0, 18).count();

    var allBiggerThan18AndMenor49 = filterArrayByAge(19, 49).count();

    var allBiggerThan49 = filterArrayByAge(50).count();

    System.out.println("menores: " + allBiggerThan18);
    System.out.println("adultas: " + allBiggerThan18AndMenor49);
    System.out.println("a partir de 50: " + allBiggerThan49);

    System.out.println();
    System.out.println("----- Percentual -----");
    System.out.println();

    var formatter = new DecimalFormat("0.#");

    var allAgeDouble = Double.parseDouble(String.valueOf(sizeAllAges));

    double menorPorcents = allBiggerThan18 / allAgeDouble * 100;
    double adultsPorcents = allBiggerThan18AndMenor49 / allAgeDouble * 100;
    double seniorPorcents = allBiggerThan49 / allAgeDouble * 100;


    System.out.println("menores: " + formatter.format(menorPorcents).concat("%"));
    System.out.println("adultas: " + formatter.format(adultsPorcents).concat("%"));
    System.out.println("a partir de 50: " + formatter.format(seniorPorcents).concat("%"));

    System.out.println();
    System.out.println("TOTAL: " + sizeAllAges);

    shouldTryAgain = false;
  }
}
