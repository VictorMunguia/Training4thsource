package com.MyProject.Movies.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MyProject.Movies.entity.contact;

@Repository("contactRepository")
public interface contactRepository extends JpaRepository<contact, Serializable> {

}
