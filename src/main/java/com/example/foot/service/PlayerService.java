package com.example.foot.service;

import com.example.foot.model.Player;
import com.example.foot.repository.PlayerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PlayerService {
    private final PlayerRepository repository;
    public List<Player> getPlayers() {
        return repository.findAll();
    }
}
