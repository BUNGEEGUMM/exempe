package com.enit.bigDataAccidentCounter.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enit.bigDataAccidentCounter.models.Accidents;

public interface AccidentRepo extends JpaRepository<Accidents,Long>{

} 