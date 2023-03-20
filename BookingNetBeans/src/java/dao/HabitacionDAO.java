/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entidad.Habitacion;
import entidad.Hotel;
import interfacesDAO.SQLTools;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import motores.MotorMySQL;

/**
 *
 * @author Usuario
 */
public class HabitacionDAO {
     private SQLTools miMotor = null;
    //private static final String SELECT_ALL ="SELECT * FROM hotel where 1=1";
     private static final String SELECT_HABITACION ="SELECT *\n"
            + "FROM HABITACION\n";
    

    public HabitacionDAO() {
        this.miMotor = new MotorMySQL();
    }
    
    public ArrayList<Habitacion> findAllHabitacion(Habitacion bean) {
        
        String sql_filtro = "";
        String sql_final = "";
        if (bean.getIdhotel()!= 0) {
            sql_filtro += "WHERE DISPONIBLE = \"V\"  AND IDHOTEL = " + bean.getIdhotel() +" ORDER BY PRECIO DESC  ";
        }
        ArrayList<Habitacion> lstHabitacion= null;
        try {
            this.miMotor.connect();
           
            sql_final = SELECT_HABITACION + sql_filtro;
            
            ResultSet resultset = this.miMotor.executeQuery(sql_final);

            if (resultset != null) {
                lstHabitacion = new ArrayList();

                while (resultset.next()) {
                    Habitacion entidad = new Habitacion();
                    entidad.setId(resultset.getInt(1));
                    entidad.setNumero(resultset.getInt(2));
                    entidad.setDescripcion(resultset.getString(3));
                    entidad.setIdhotel(resultset.getInt(4));
                    entidad.setCapacidad(resultset.getInt(5));
                    entidad.setPrecio(resultset.getInt(6));
                    entidad.setDisponible(resultset.getString(7));
                    lstHabitacion.add(entidad);
                }
            }
            this.miMotor.disconnect();
        } catch (Exception ex) {
            Logger.getLogger(HabitacionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstHabitacion;
    }
}
