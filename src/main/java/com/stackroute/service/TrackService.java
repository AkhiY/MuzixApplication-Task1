package com.stackroute.service;




import com.stackroute.domain.Track;
import com.stackroute.exceptions.IdNotFoundException;
import com.stackroute.exceptions.TrackAlreadyExistsException;
import com.stackroute.exceptions.TrackNotFoundException;

import java.util.List;

public interface TrackService {
    public Track saveTrack(Track track)throws TrackAlreadyExistsException;
    public List<Track> getAllTracks();
    public boolean deleteTrack(int id)throws TrackNotFoundException;
    public Track updateTrack(Track track) throws IdNotFoundException;


}