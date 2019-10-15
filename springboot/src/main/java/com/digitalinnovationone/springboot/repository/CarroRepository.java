package com.digitalinnovationone.springboot.repository;

import com.digitalinnovationone.springboot.models.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro, Long> {

}
