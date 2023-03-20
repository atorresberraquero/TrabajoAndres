/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidad.Booking;
import entidad.Hotel;
import entidad.Usuario;
import interfacesDAO.SQLTools;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import motores.MotorMySQL;

/**
 *
 * @author S2-PC00
 */
public class BookingDAO {
    private SQLTools miMotor = null;
    private static final String SELECT_ALL ="SELECT * FROM booking where 1=1";
     /*private static final String SELECT_RATE ="SELECT *\n"
            + "FROM HOTEL\n" +
            "ORDER BY RATE DESC\n";
     private static final String SELECT_RESERVAS ="SELECT* \n"
            + "FROM HOTEL\n" +
            "ORDER BY RESERVAS DESC\n";*/

    public BookingDAO() {
        this.miMotor = new MotorMySQL();
    }
     public ArrayList<Booking> findAll(Booking bean) {
        String sql_filtro = "";
        String sql_final = "";
        ArrayList<Booking> lstBooking= null;
        try {
            this.miMotor.connect();
           
            sql_final = SELECT_ALL + sql_filtro;
            
            ResultSet resultset = this.miMotor.executeQuery(sql_final);

            if (resultset != null) {
                lstBooking = new ArrayList();

                while (resultset.next()) {
                    Booking entidad = new Booking();
                    entidad.setIdUsuario(resultset.getInt(1));
                    entidad.setIdHabitacion(resultset.getInt(2));
                    entidad.setReserva(resultset.getInt(3));

                   
                    lstBooking.add(entidad);
                }
            }
            this.miMotor.disconnect();
        } catch (Exception ex) {
            Logger.getLogger(BookingDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstBooking;
    }
     
}
