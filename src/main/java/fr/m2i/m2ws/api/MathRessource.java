package fr.m2i.m2ws.api;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import fr.m2i.m2ws.utiles.Calculatrice;

@Path("/math/")
public class MathRessource {

    @Path("/add/{n}-{n2}")
    @GET
    public int addNumbers(@PathParam("n") int n, @PathParam("n2") int n2){
        int calcul1 = Calculatrice.add(n,n2);

        return calcul1;

    }

    @Path("/sous/{n}-{n2}")
    @GET
    public int sousNumbers(@PathParam("n") int n, @PathParam("n2") int n2){
        int calcul2 = Calculatrice.sous(n,n2);

        return calcul2;

    }
    @Path("/multi/{n}-{n2}")
    @GET
    public int multNumbers(@PathParam("n") int n, @PathParam("n2") int n2){
        int calcul3 = Calculatrice.multi(n,n2);

        return calcul3;

    }
    @Path("/div/{n}-{n2}")
    @GET
    public float divNumbers(@PathParam("n") int n, @PathParam("n2") int n2){
        float calcul4 = Calculatrice.div(n,n2);

        return calcul4;

    }
    @Path("/factorial/{n}")
    @GET

    public int factorial(@PathParam("n") int n){
        int calcul5 = Calculatrice.facto(n);

        return calcul5;

    }



}


