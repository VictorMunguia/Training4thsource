package com.victorfirsttutorial.backendninja.reporsitory;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.victorfirsttutorial.backendninja.entity.estudiante;

@Repository("estudianteJpaRepositorio")
public interface EstudianteJpaRepositorio extends JpaRepository<estudiante, Serializable> {

}
