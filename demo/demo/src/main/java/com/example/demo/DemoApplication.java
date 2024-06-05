package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.models.campeon;
import com.example.demo.models.campeonhasinteraccion;
import com.example.demo.models.counter;
import com.example.demo.models.especie;
import com.example.demo.models.interaccion;
import com.example.demo.models.rival;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class DemoApplication {
	@Autowired
    private counter counterRepository;

    @Autowired
    private campeon campeonRepository;

    @Autowired
    private especie especieRepository;

    @Autowired
    private rival rivalRepository;

    @Autowired
    private interaccion interaccionRepository;

    @Autowired
    private campeonhasinteraccion campeonHasInteraccionRepository;

    public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

    @PostConstruct
    public void generateData() {
        
    }
}
