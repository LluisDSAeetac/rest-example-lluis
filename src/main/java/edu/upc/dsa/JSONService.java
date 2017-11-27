package edu.upc.dsa;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/json")
public class JSONService {

    private TracksRes tracks = Main.tracks;

    @GET
    @Path("/got/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Track getTrack(@PathParam("id") int id) {
        return tracks.getTrackById(id);
    }

    @GET
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    public Track getTrackInJSON() {
        // Return last track in the list tracks
        Track track = tracks.getTrackById(tracks.numTracks()-1);
        return track;
    }

    @GET
    @Path("/getAll")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Track> getTrackAll() {
        return tracks.getTracksAll();
    }


    @POST
    @Path("/new")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response newTrack(Track track) {
        tracks.addTrack(track);
        return Response.status(201).entity("Track added in position "+tracks.numTracks()).build();
    }

    @POST
    @Path("/post")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createTrackInJSON(Track track) {
        String result = "Track saved : " + track;
        return Response.status(201).entity(result).build();
    }

    @DELETE
    @Path("/del/{id}")
    //@Produces(MediaType.APPLICATION_JSON)
    public Response delTrack(@PathParam("id") int id) {
        Track track = tracks.rmTrack(id);
        String result = "Track deleted : " + id;
        return Response.status(201).entity(result).build();
    }
}