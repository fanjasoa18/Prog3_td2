package com.example.foot.controller.response;

import com.example.foot.model.Player;
import com.example.foot.model.Sponsor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class TeamResponse {
    private int id_team;
    private List<Player> players;
    private List<Sponsor> sponsors;

}
