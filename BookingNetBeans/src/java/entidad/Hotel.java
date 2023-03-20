/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.ArrayList;

/**
 *
 * @author S2-PC00
 */
public class Hotel {

    private int id;
    private String nombre;
    private String descripcion;
    private String Ciudad;
    private String Pais;
    private int rate;
    private int opiniones;
    private String img;

    public Hotel() {

    }

    public Hotel(int id, String nombre, String descripcion, String Ciudad, String Pais, int rate, int opiniones, String img) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.Ciudad = Ciudad;
        this.Pais = Pais;
        this.rate = rate;
        this.opiniones = opiniones;
        this.img =img;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getOpiniones() {
        return opiniones;
    }

    public void setOpiniones(int opiniones) {
        this.opiniones = opiniones;
    }

    
   

    public static String fromArrayListToJsonRATE(ArrayList<Hotel> lstHoteles) {
        String resp = "[";
        for (Hotel hotel : lstHoteles) {
            resp += "{"
                    + "\"ID_HOTEL\" :\"" + hotel.getId() + "\", "
                    + "\"NOMBRE\" : \"" + hotel.getNombre() + "\","
                    + "\"DESCRIPCION\" : \"" + hotel.getDescripcion() + "\","
                    + "\"CIUDAD\" : \"" + hotel.getCiudad() + "\","
                    + "\"PAIS\" : \"" + hotel.getPais() + "\","                 
                    + "\"RATE\" : \"" + hotel.getRate() + "\","
                    + "\"OPINIONES\" : \"" + hotel.getOpiniones()+ "\","
                    + "\"IMG\" : \"" + hotel.getImg()+"\"}";
            resp += ",";
        }
        resp = resp.substring(0, resp.length() - 1);
        resp += "]";
        return resp;
    }
    public static String fromArrayListToJsonRESERVAS(ArrayList<Hotel> lstHoteles) {
        String resp = "[";
        for (Hotel hotel : lstHoteles) {
            resp += "{"                
                  + "\"ID_HOTEL\" :\"" + hotel.getId() + "\", "
                    + "\"NOMBRE\" : \"" + hotel.getNombre() + "\","
                    + "\"DESCRIPCION\" : \"" + hotel.getDescripcion() + "\","
                    + "\"CIUDAD\" : \"" + hotel.getCiudad() + "\","
                    + "\"PAIS\" : \"" + hotel.getPais() + "\","                 
                    + "\"RATE\" : \"" + hotel.getRate() + "\","
                    + "\"OPINIONES\" : \"" + hotel.getOpiniones()+ "\","
                    + "\"IMG\" : \"" + hotel.getImg()+ "\"}";
            resp += ",";
        }
        resp = resp.substring(0, resp.length() - 1);
        resp += "]";
        return resp;
    }

}
