package com.example.foot.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_player;
    private int id_team;
    private String name_player;
    private Number number;

    @ManyToOne
    @JoinColumn(name = "id_team")
    private Team team;
}