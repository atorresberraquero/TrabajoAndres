/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidad.Hotel;
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
public class HotelesDAO {
    private SQLTools miMotor = null;
    //private static final String SELECT_ALL ="SELECT * FROM hotel where 1=1";
     private static final String SELECT_RATE ="SELECT *\n"
            + "FROM HOTEL\n" +
            "ORDER BY RATE DESC\n";
     private static final String SELECT_RESERVAS ="SELECT* \n"
            + "FROM HOTEL\n" 
            +"ORDER BY RESERVAS DESC "
             + "LIMIT 10\n";

    public HotelesDAO() {
        this.miMotor = new MotorMySQL();
    }
     public ArrayList<Hotel> findAllRate(Hotel bean) {
        String sql_filtro = "";
        String sql_final = "";
        ArrayList<Hotel> lstHoteles= null;
        try {
            this.miMotor.connect();
           
            sql_final = SELECT_RATE + sql_filtro;
            
            ResultSet resultset = this.miMotor.executeQuery(sql_final);

            if (resultset != null) {
                lstHoteles = new ArrayList();

                while (resultset.next()) {
                    Hotel entidad = new Hotel();
                    entidad.setId(resultset.getInt(1));
                    entidad.setNombre(resultset.getString(2));
                    entidad.setDescripcion(resultset.getString(3));
                    entidad.setCiudad(resultset.getString(4));
                    entidad.setPais(resultset.getString(5));
                    entidad.setRate(resultset.getInt(6));
                    entidad.setOpiniones(resultset.getInt(7));
                    entidad.setImg(resultset.getString(8));
                    lstHoteles.add(entidad);
                }
            }
            this.miMotor.disconnect();
        } catch (Exception ex) {
            Logger.getLogger(HotelesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstHoteles;
    }
      public ArrayList<Hotel> findAllReservas(Hotel bean) {
        String sql_filtro = "";
        String sql_final = "";
        ArrayList<Hotel> lstHoteles= null;
        try {
            this.miMotor.connect();
           
            sql_final = SELECT_RESERVAS + sql_filtro;
            
            ResultSet resultset = this.miMotor.executeQuery(sql_final);

            if (resultset != null) {
                lstHoteles = new ArrayList();

                while (resultset.next()) {
                    Hotel entidad = new Hotel();              
                    entidad.setId(resultset.getInt(1));
                    entidad.setNombre(resultset.getString(2));
                    entidad.setDescripcion(resultset.getString(3));
                    entidad.setCiudad(resultset.getString(4));
                    entidad.setPais(resultset.getString(5));
                    entidad.setRate(resultset.getInt(6));
                    entidad.setOpiniones(resultset.getInt(7));
                    entidad.setImg(resultset.getString(8));
                    lstHoteles.add(entidad);
                }
            }
            this.miMotor.disconnect();
        } catch (Exception ex) {
            Logger.getLogger(HotelesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstHoteles;
    }
}
