package com.greenfoxacademy.webapp;

import com.greenfoxacademy.webapp.dj.service.MyColor;
import com.greenfoxacademy.webapp.dj.service.Printer;
import com.greenfoxacademy.webapp.dj.service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class WebappApplication implements CommandLineRunner {

    private Printer printer;
    private MyColor myColor;
    private UtilityService utilityService;


    @Autowired
    WebappApplication(Printer printer, MyColor myColor, UtilityService utilityService) {
        this.printer = printer;
        this.myColor=myColor;
        this.utilityService=utilityService;
    }


    public static void main(String[] args) {
        SpringApplication.run(WebappApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        printer.log("Öcsike");
        printer.log(myColor.printcolor());
    }



}
