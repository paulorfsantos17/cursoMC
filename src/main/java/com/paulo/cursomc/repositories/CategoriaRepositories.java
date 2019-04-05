package com.paulo.cursomc.repositories;



import org.springframework.stereotype.Repository;

import com.paulo.cursomc.domain.Categoria;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CategoriaRepositories  extends JpaRepository <Categoria , Integer> {

}
