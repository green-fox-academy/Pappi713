package com.demo.controller;

import com.demo.model.*;
import com.demo.service.SongService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.PUT;

@RestController
public class SongController {

    private SongService songService;

    @Autowired
    public SongController(SongService songService){
        this.songService=songService;
    }

    @GetMapping("/awesome")
    public ResponseEntity<?> songList(@RequestParam(required = false) Integer rating){
        if(rating!=null){
            return ResponseEntity.ok(songService.filteredSongs(rating));
        }
        else{
            List<Song> songs=songService.getSonglist();
            if(songs!=null){
                return ResponseEntity.ok(songs);
            }
            else{
                return ResponseEntity.ok( new ErrorMessage("No songs in the current list"));
            }
        }
    }

    @PostMapping("/awesome")
    public ResponseEntity<?> addSong(@RequestBody Song song){
        songService.addSong(song);
        return ResponseEntity.ok(song);
    }

    @DeleteMapping("/awesome/{id}")
    public ResponseEntity<?> deleteSong(@PathVariable Long id){
        return ResponseEntity.ok(songService.deleteSong(id));
    }

    @PutMapping("/awesome/{id}")
//    @RequestMapping(value = "/awesome/{id}", method = PUT)
    public ResponseEntity<?> updateRating(@PathVariable Long id, @RequestParam Integer rating){
        return songService.updateSongbyID(id,rating);
    }

//    @GetMapping("/awesome")
//    public List<Song> filterByRating(@RequestParam Integer rating){
//        return songService.filteredSongs(rating);
//    }
}
