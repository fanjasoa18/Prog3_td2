package com.example.foot.controller.mapper;

import com.example.foot.controller.response.TeamResponse;
import com.example.foot.model.Team;
import com.example.foot.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class TeamRestMapper {
    private final TeamService service;
    public TeamResponse toRest(Team domain) {
        return TeamResponse.builder()
                .id_team(domain.getId_team())
                .players(domain.getPlayers())
                .sponsors(domain.getSponsors())
                .build();
    }
}
