package com.example.foot.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_team;
    private String name_team;

    @OneToMany(mappedBy = "player")
    private List<Player> players;

    @ManyToMany
    @JsonIgnore
    private List<Sponsor> sponsors = new ArrayList<>();
}
