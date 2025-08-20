package com.devsuperior.dslist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entity.Game;

public interface GameRepository extends JpaRepository<Game,Long>{

}
