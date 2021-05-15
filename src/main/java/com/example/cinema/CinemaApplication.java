package com.example.cinema;

import com.example.cinema.sid.ICinemaInitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CinemaApplication implements CommandLineRunner {

    @Autowired
    private ICinemaInitService initService;

    public static void main(String[] args) {
        SpringApplication.run(CinemaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        initService.initVilles();
        initService.initCinemas();
        initService.initSalles();
        initService.initPlaces();
        initService.initSeances();
        initService.initGategories();
        initService.initFilms();
        initService.initProjections();
        initService.initTickets();
    }
}
