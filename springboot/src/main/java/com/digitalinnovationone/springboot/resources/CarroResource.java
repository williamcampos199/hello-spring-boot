package com.digitalinnovationone.springboot.resources;

import com.digitalinnovationone.springboot.models.Carro;
import com.digitalinnovationone.springboot.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/api")
public class CarroResource {
    @Autowired
    CarroRepository carroRepository;

    @GetMapping("/carros")
    public List<Carro> listaCarros(){
        return carroRepository.findAll();
    }

}
