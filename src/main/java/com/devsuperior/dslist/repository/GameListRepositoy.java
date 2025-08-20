package com.devsuperior.dslist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entity.GameList;

public interface GameListRepositoy extends JpaRepository<GameList, Long>{

}