package com.ttcl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ttcl.entity.Players;
import com.ttcl.service.RankingService;

@RestController
public class RankingController {
	
	@Autowired
	private RankingService service;

	@GetMapping("/getAllPlayers")
	public List<Players> getAllPlayers(){
		return service.getAllPlayers();
	}
	
	@PostMapping("/addPlayer")
	public Players addPlayer(@RequestBody Players player) {
		return service.addPlayer(player);
	}
	
}
