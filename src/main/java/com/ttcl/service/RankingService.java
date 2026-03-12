package com.ttcl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ttcl.entity.Players;
import com.ttcl.repository.RankingRepo;

@Service
public class RankingService {

	@Autowired
	private RankingRepo repo;
	
	public List<Players> getAllPlayers(){
		return repo.findAll();
	}
	
	public Players addPlayer(Players player){
		return repo.save(player);
	}
}
