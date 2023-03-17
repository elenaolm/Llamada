/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema8.Interfaces.Llamadas;

import Tema8.Interfaces.Llamadas.Llamada.ZonaInterlocutor;
import java.time.LocalDateTime;

/**
 *
 * @author Elena Oliva
 */
public class TestLlamada {

    public static void main(String[] args) {
        Llamada L1 = new Llamada(665436782, 675342198, false, LocalDateTime.of(2023, 12, 22, 8, 35), LocalDateTime.of(2023, 12, 22, 9, 15), ZonaInterlocutor.ZONA_2);
        Llamada L2 = new Llamada(645896723, 685431908, true, LocalDateTime.of(2023, 11, 12, 13, 40), LocalDateTime.of(2023, 11, 12, 15, 25), ZonaInterlocutor.ZONA_2);
        System.out.println(L1);
        System.out.println(L2);
    }

}
