package com.devsuperior.dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.entity.GameList;
import com.devsuperior.dslist.repository.GameListRepositoy;

@Service
public class GameListService {

    @Autowired
    private GameListRepositoy gameListRepositoy;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepositoy.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}
