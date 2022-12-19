package com.example.foot.controller.mapper;

import com.example.foot.controller.response.PlayerResponse;
import com.example.foot.model.Player;
import com.example.foot.repository.TeamRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PlayerRestMapper {
    private final TeamRepository teamRepository;
    public PlayerResponse toRest(Player domain) {
        return PlayerResponse.builder()
                .id_player(domain.getId_player())
                .name_player(domain.getName_player())
                .build();
    }
}
