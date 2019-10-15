package com.digitalinnovationone.springboot.resources;

import com.digitalinnovationone.springboot.models.Carro;
import com.digitalinnovationone.springboot.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class CarroResource {
    @Autowired
    CarroRepository carroRepository;

    @GetMapping("/carros")
    public List<Carro> listaCarros(){
        return carroRepository.findAll();
    }

    @PostMapping("/carro")
    public Carro salvarCarro(@RequestBody Carro carro){
        return carroRepository.save(carro);
    }

    @PutMapping("/carro")
    public  Carro atualizarCarro(@RequestBody Carro carro){
        return carroRepository.save(carro);
    }

    @DeleteMapping("/carro")
    public void deletarCarro(@RequestBody Carro carro){
        carroRepository.delete(carro);
    }




}
