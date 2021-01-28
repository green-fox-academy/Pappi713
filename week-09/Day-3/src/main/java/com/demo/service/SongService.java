package com.demo.service;

import com.demo.model.Song;
import com.demo.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SongService {

     private SongRepository songRepository;

    @Autowired
    public SongService(SongRepository songRepository){
        this.songRepository=songRepository;
    }

    public List<Song> getSonglist(){
        return (List<Song>) songRepository.findAll();
    }

    public void addSong(Song song){
        songRepository.save(song);
    }

    public List<Song> deleteSong(Long id){
        songRepository.deleteById(id);
        return (List<Song>) songRepository.findAll();
    }

    public ResponseEntity<?> updateSongbyID(Long id, Integer rating){
        Optional<Song> updatedSong=songRepository.findById(id);
        if(updatedSong.isPresent()){
            Song song=updatedSong.get();
            song.setRating(rating);
            songRepository.save(song);
            return ResponseEntity.ok(song);
        }
        return ResponseEntity.badRequest().body(songRepository.findAll());
    }

    public List<Song> filteredSongs(Integer rating){
        List<Song> songs= (List<Song>) songRepository.findAll();
        return songs.stream().filter(x->x.getRating()==rating).collect(Collectors.toList());
    }
}
