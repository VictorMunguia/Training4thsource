//2.- CREAMOS UNA INTERFAZ LA CUAL EXTIENDE A jpa y unimos a la clase Curso para que herede todas las propiedades para modificar la base de datos.
package com.victorfirsttutorial.backendninja.reporsitory;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.victorfirsttutorial.backendninja.entity.Curso;

@Repository("cursoJpaRepositorio")
public interface CursoJpaRepositorio extends JpaRepository<Curso, Serializable>{//La interfaz nos da la capacidad de mandarlo a llamar la clase que trae la tabla y utilizar todas sus funciones.

}
