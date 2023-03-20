package entidad;

import java.util.ArrayList;

public class Booking {
    // ATRIBUTES
    private  int idHabitacion;
    private  int reserva;
    private  int idUsuario;
    
    // CONSTRUCTOR
    public Booking(int idHabitacion, int reserva, int idUsuario) {
        this.idHabitacion = idHabitacion;
        this.reserva = reserva;
        this.idUsuario = idUsuario;
    }
    
    
    // GETTERS/SETTERS

    public Booking() {
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setReserva(int reserva) {
        this.reserva = reserva;
    }


    public int getIdUsuario() {
        return idUsuario;
    }

    public int getReserva() {
        return reserva;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

   
        public static String fromArrayListToJson(ArrayList<Booking> lstBooking) {
        String resp = "[";
        for (Booking booking : lstBooking) {
            resp += "{"
                    + "\"ID_Habitacion\" :\"" + booking.getIdHabitacion() + "\", "
                    + "\"ID_Habitacion\" :\"" + booking.getReserva()+ "\", "
                    + "\"OPINIONES\" : \"" + booking.getIdUsuario()+ "\"}";
            resp += ",";
        }
        resp = resp.substring(0, resp.length() - 1);
        resp += "]";
        return resp;
    }
}
