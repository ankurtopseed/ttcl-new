package com.ttcl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ttcl.entity.Players;

@Repository
public interface RankingRepo extends JpaRepository<Players, Integer>{

}
