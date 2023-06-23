package org.example;

import java.time.LocalTime;

public class CancelaEstacionamento {
    public boolean ehHorarioComercial() {
      LocalTime horaInicio = LocalTime.of(8,0);
      LocalTime horaFinal = LocalTime.of(18,0);
      LocalTime horaAtual = LocalTime.now();

      return horaAtual.isAfter(horaInicio) && horaAtual.isBefore(horaFinal);
    }

}
