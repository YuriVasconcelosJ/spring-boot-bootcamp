package com.devsuperior.dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entity.Game;
import com.devsuperior.dslist.projection.GameMinProjection;
import com.devsuperior.dslist.repository.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    // Verificar isso dps
    @Transactional(readOnly = true)
    public GameDTO findById(Long gameId) {
        Game result = gameRepository.findById(gameId).get();
        // Tratamento de exceções
        return new GameDTO(result);
        
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
        
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(@PathVariable Long listId){
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(x -> new GameMinDTO(x)).toList(); 
    }

}
