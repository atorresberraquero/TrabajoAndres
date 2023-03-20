/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Habitacion {
    private int id;
    private int numero;
    private String descripcion;
    private int idhotel;
    private int capacidad;
    private int precio;
    private String disponible;

    public Habitacion() {
    }

    public Habitacion(int id, int numero, String descripcion, int idhotel, int capacidad, int precio, String disponible) {
        this.id = id;
        this.numero = numero;
        this.descripcion = descripcion;
        this.idhotel = idhotel;
        this.capacidad = capacidad;
        this.precio = precio;
        this.disponible = disponible;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdhotel() {
        return idhotel;
    }

    public void setIdhotel(int idhotel) {
        this.idhotel = idhotel;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDisponible() {
        return disponible;
    }

    public void setDisponible(String disponible) {
        this.disponible = disponible;
    }
    
    
     public static String fromArrayListToJsonHabitaciones(ArrayList<Habitacion> lstHabitacion) {
        String resp = "[";
        for (Habitacion habitacion : lstHabitacion) {
            resp += "{"                
                  + "\"ID_HABITACION\" :\"" + habitacion.getId() + "\", "
                    + "\"NUMERO\" : \"" + habitacion.getNumero() + "\","
                    + "\"DESCRIPCION\" : \"" + habitacion.getDescripcion() + "\","
                    + "\"IDHOTEL\" : \"" + habitacion.getIdhotel()+ "\","
                    + "\"CAPACIDAD\" : \"" + habitacion.getCapacidad() + "\","                 
                    + "\"PRECIO\" : \"" + habitacion.getPrecio() + "\","
                    + "\"DISPONIBLE\" : \"" + habitacion.getDisponible()+ "\"}";
            resp += ",";
        }
        resp = resp.substring(0, resp.length() - 1);
        resp += "]";
        return resp;
    }
}
