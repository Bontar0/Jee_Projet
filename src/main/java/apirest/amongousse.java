package apirest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("sample")
public class amongousse {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/among")
    public Response getCrew() {
        // src: https://attaque-des-titans.fandom.com/fr/wiki/Titans
        
        List<CrewMember> crewMember = new ArrayList<>();

        CrewMember Mycrew = new CrewMember();

        Mycrew.setJob("Imposteur");
        Mycrew.setName("Nom Imposteur");

        crewMember.add(Mycrew);
      // crewMember = {"test","test2"};
      //crewMember.add("test");

        return Response.ok(crewMember).build();
    }

    

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/postamong")
    public Response testPost(CrewMember moncCrewMember) {

        moncCrewMember.setName("New name");
        moncCrewMember.setJob("set job");

        if (moncCrewMember.getName() == null){
            return Response.status(403).build();
        }
        return Response.ok("Posted " + moncCrewMember.getName() + ". Age: " + moncCrewMember.getJob()).build();
    }

    //return Response.ok(CrewMember).build();
}
