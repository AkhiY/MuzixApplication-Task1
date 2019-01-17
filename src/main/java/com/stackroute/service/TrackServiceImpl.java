package com.stackroute.service;

import com.stackroute.domain.Track;
import com.stackroute.exceptions.IdNotFoundException;
import com.stackroute.exceptions.TrackNotFoundException;
import com.stackroute.exceptions.TrackAlreadyExistsException;
import com.stackroute.repository.TrackRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrackServiceImpl implements TrackService {

    TrackRepository trackRepositroy;

    @Autowired
    public TrackServiceImpl(TrackRepository trackRepositroy) {
        this.trackRepositroy = trackRepositroy;
    }

    @Override
    public Track saveTrack(Track track) throws TrackAlreadyExistsException{
        if(trackRepositroy.existsById(track.getId()))
        {
            throw new TrackAlreadyExistsException("Track already exists");
        }
        Track savedTrack=trackRepositroy.save(track);
        if (savedTrack == null) {

            throw new TrackAlreadyExistsException("Track already exists");
        }
        return savedTrack;
    }

    @Override
    public List<Track> getAllTracks() {
        return trackRepositroy.findAll();
    }

    @Override
    public boolean deleteTrack(int id) throws TrackNotFoundException {
        //return null;
        boolean status=false;
        if(trackRepositroy.existsById(id))
        {
            trackRepositroy.deleteById(id);
            status=true;
            return status;
        }
        else
        {

            throw new TrackNotFoundException("Track not found");
        }


    }
    @Override
    public Track updateTrack(Track track) throws IdNotFoundException {
        if(trackRepositroy.existsById(track.getId()))
        {

            Track updateTrack=trackRepositroy.save(track);
            return updateTrack;


        }

        else {

            throw new IdNotFoundException("ID doesnt exist");
        }



    }



}