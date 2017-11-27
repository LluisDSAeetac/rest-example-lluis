package edu.upc.dsa;

import java.util.ArrayList;
import java.util.List;

public class TracksRes {

    List<Track> tracks = new ArrayList<>();

    public TracksRes () {

    }

    public void setTracksAll(List<Track> tracks) {
        this.tracks = tracks;
    }

    public List<Track> getTracksAll() {
        return tracks;
    }

    public void addTrack(Track track) {
         tracks.add(track);
    }

    public Track getTrackById(int id) {
        return tracks.get(id);
    }

    public Track getTrack(int id) {
        return tracks.get(id);
    }

    public int numTracks() {
        return tracks.size();
    }

    public Track rmTrack(int id) {
         return tracks.remove(id);
    }

    @Override
    public String toString() {
        return "{tracks :" + tracks + "}";
    }


}