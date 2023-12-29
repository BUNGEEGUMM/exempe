package com.enit.bigDataAccidentCounter.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.enit.bigDataAccidentCounter.Repo.AccidentRepo;
import com.enit.bigDataAccidentCounter.models.Accidents;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AccidentService {

    private final AccidentRepo accidentRepo;
    
    public List<Accidents> getAllAccidents(){
        return accidentRepo.findAll();
    }
}
