package com.example.foot.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Have {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_has;
    @ManyToMany
    @JsonIgnore
    @JoinTable(
            name = "Team",
            joinColumns = @JoinColumn(name = "id_team"))
    private List<Team> id_team;

    @ManyToMany
    @JsonIgnore
    @JoinTable(
            name = "Sponsor",
            joinColumns = @JoinColumn(name = "id_sponsor"))
    private List<Sponsor> id_sponsor;

}
