package com.example.foot.controller;

import com.example.foot.controller.mapper.PlayerRestMapper;
import com.example.foot.controller.response.PlayerResponse;
import com.example.foot.service.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class PlayerController {
    private final PlayerService service;
    private final PlayerRestMapper mapper;

    @GetMapping("/players")
    public List<PlayerResponse> getPlayers() {
        return service.getPlayers().stream()
                .map(mapper::toRest)
                .toList();
    }
}
