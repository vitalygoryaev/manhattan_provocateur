package manhattan;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/")
public class ScheduleHandler {
    @GET
    @Produces("application/json")
    public String getClichedMessage() {
        return "xo xo GOSSIP GIRL";
    }

    @GET
    @Path("/schedule")
    @Produces("text/plain")
    public String getIdFromMessage(@QueryParam("group") int groupID, @QueryParam("faculty") String facultyName) {
        //check for correct parameters
        if (groupID == 0 || facultyName == null)
            return "not enough parameters";

        //return schedule link
        return Integer.toString(groupID);
    }

    @GET
    @Path("/response")
    public Response returnComplexResponse() {
        String responseText = "Shit";
        return Response.status(200).build();
    }
}
