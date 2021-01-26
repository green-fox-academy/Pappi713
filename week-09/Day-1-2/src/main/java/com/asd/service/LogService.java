package com.asd.service;

import com.asd.model.log.Log;
import com.asd.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class LogService {

    private LogRepository logRepository;
    List<Log> logList;

    @Autowired
    public LogService(LogRepository logRepository) {
        this.logRepository = logRepository;
    }


    public Timestamp getPostedTime() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp;
    }

    public void newEntity(Timestamp timestamp, String endpoint, String data){
        logRepository.save( new Log(timestamp,endpoint,data));
    }

    public List<Log> logList(){
        return (List<Log>) logRepository.findAll();
    }


    public String randomworld(){
        Random random=new Random();
        List<String> words=new ArrayList<>();
        words.add(" Err...");
        words.add(" Mehh..");
        words.add(" Cancer.");
        words.add(" Uhhm.");
        words.add(" Lofaszka");
        words.add(" Beleverem.");

        return words.get(random.nextInt(words.size()));
    }

}
