/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APIs;

import dao.HabitacionDAO;
import dao.HotelesDAO;
import entidad.Habitacion;
import entidad.Hotel;
import java.util.ArrayList;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author S2-PC00
 */
@Path("filtrHabitacionHotel")
public class FiltrHabitacionHotelResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of FiltrHabitacionHotelResource
     */
    public FiltrHabitacionHotelResource() {
    }

    /**
     * Retrieves representation of an instance of APIs.FiltrHabitacionHotelResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
         HabitacionDAO habitacionDAO = new HabitacionDAO();
        ArrayList<Habitacion> lstHabitacion = habitacionDAO.findAllHabitacion(null);
        return Habitacion.fromArrayListToJsonHabitaciones(lstHabitacion);
    }

    /**
     * PUT method for updating or creating an instance of FiltrHabitacionHotelResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
