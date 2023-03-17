/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema8.Interfaces.Llamadas;

import java.time.LocalDateTime;
import static java.time.temporal.ChronoUnit.MINUTES;

/**
 *
 * @author Elena Oliva
 */
//En una compañía de telecomunicaciones se desean registrar los datos de todas las llamadas de sus
//clientes. Implementar la clase Llamada, que guardará los siguientes datos: número de teléfono del
//cliente, número del interlocutor, atributo booleano que indique si la llamada es saliente, fecha y hora
//del inicio de la llamada y del fin, atributo enumerado que indique la zona del interlocutor (suponer
//cinco zonas con tarifas distintas) y tabla de constantes con las tarifas de las zonas en céntimos de
//euro/minuto. En la clase se establecerá un orden natural compuesto basado en el número del teléfono
//del cliente como primer criterio y en la fecha y hora de inicio como segundo criterio. Asimismo, se
//implementará un método que devuelva la duración en minutos de la llamada y otro que calcule su
//coste, si es saliente. Por último, implementar el método toString(), que muestre los dos números de
//teléfono, la fecha y hora del inicio, la duración y el coste.
public class Llamada {

    private int numeroTelfono;
    private int numeroInterloc;
    private boolean llamadaSaliente;
    private LocalDateTime fechaHoraInicio;
    private LocalDateTime fechaHoraFinal;
    private ZonaInterlocutor zonaInterlocutor;

    public enum ZonaInterlocutor {
        ZONA_1, ZONA_2, ZONA_3, ZONA_4, ZONA_5
    }

    public Llamada(int numeroTelfono, int numeroInterloc, boolean llamadaSaliente, LocalDateTime fechaHoraInicio, LocalDateTime fechaHoraFinal, ZonaInterlocutor zonaInterlocutor) {
        this.numeroTelfono = numeroTelfono;
        this.numeroInterloc = numeroInterloc;
        this.llamadaSaliente = llamadaSaliente;
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraFinal = fechaHoraFinal;
        this.zonaInterlocutor = zonaInterlocutor;
    }
    private static final double TARIFA_ZONA_1 = 0.5;
    private static final double TARIFA_ZONA_2 = 0.75;
    private static final double TARIFA_ZONA_3 = 0.10;
    private static final double TARIFA_ZONA_4 = 0.65;
    private static final double TARIFA_ZONA_5 = 0.50;

    public long duracionEnMinutos() {
        return fechaHoraInicio.until(fechaHoraFinal, MINUTES);
    }

    public double costo() {
        double precioMinuto = 0;
        if (!llamadaSaliente) {
            return 0;
        }
        switch (zonaInterlocutor) {
            case ZONA_1:
                precioMinuto = TARIFA_ZONA_1;
                break;
            case ZONA_2:
                precioMinuto = TARIFA_ZONA_2;
                break;
            case ZONA_3:
                precioMinuto = TARIFA_ZONA_3;
                break;
            case ZONA_4:
                precioMinuto = TARIFA_ZONA_4;
                break;
            case ZONA_5:
                precioMinuto = TARIFA_ZONA_5;
                break;
        }
        return duracionEnMinutos() * precioMinuto;
    }

    public int getNumeroTelfono() {
        return numeroTelfono;
    }

    public void setNumeroTelfono(int numeroTelfono) {
        this.numeroTelfono = numeroTelfono;
    }

    public int getNumeroInterloc() {
        return numeroInterloc;
    }

    public void setNumeroInterloc(int numeroInterloc) {
        this.numeroInterloc = numeroInterloc;
    }

    public boolean isLlamadaSaliente() {
        return llamadaSaliente;
    }

    public void setLlamadaSaliente(boolean llamadaSaliente) {
        this.llamadaSaliente = llamadaSaliente;
    }

    public LocalDateTime getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public void setFechaHoraInicio(LocalDateTime fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    public LocalDateTime getFechaHoraFinal() {
        return fechaHoraFinal;
    }

    public void setFechaHoraFinal(LocalDateTime fechaHoraFinal) {
        this.fechaHoraFinal = fechaHoraFinal;
    }

    public ZonaInterlocutor getZonaInterlocutor() {
        return zonaInterlocutor;
    }

    public void setZonaInterlocutor(ZonaInterlocutor zonaInterlocutor) {
        this.zonaInterlocutor = zonaInterlocutor;
    }

    @Override
    public String toString() {
        return "Llamada{" + "numero de Telfono=" + numeroTelfono + ", numeroInterloc=" + numeroInterloc + ", llamada saliente=" + llamadaSaliente + ", inidio de la llamada=" + fechaHoraInicio + ", precio=" + costo() + ", duracion de la llamada=" + duracionEnMinutos() + '}';
    }
}
