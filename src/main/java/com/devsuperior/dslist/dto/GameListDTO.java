package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entity.GameList;

public class GameListDTO {

    private Long id;
    private String title;

    public GameListDTO() {
    }

    public GameListDTO(GameList game) {
        id = game.getId();
        title = game.getTitle(); 
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    

}
