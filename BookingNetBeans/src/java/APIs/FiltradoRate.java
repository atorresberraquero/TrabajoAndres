/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APIs;

import dao.HotelesDAO;
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
 *ESTO FILTRA POR MAS RESERVAS 
 */
@Path("filtrRate")
public class FiltradoRate {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of FiltradoRate
     */
    public FiltradoRate() {
    }

    /**
     * Retrieves representation of an instance of APIs.FiltradoRate
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        HotelesDAO hotelesDAO = new HotelesDAO();
        ArrayList<Hotel> lstHoteles = hotelesDAO.findAllRate(null);
        return Hotel.fromArrayListToJsonRATE(lstHoteles);
        //throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of FiltradoRate
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
