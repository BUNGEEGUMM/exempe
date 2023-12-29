package com.enit.bigDataAccidentCounter.Controler;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enit.bigDataAccidentCounter.models.Accidents;
import com.enit.bigDataAccidentCounter.service.AccidentService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/accident")
@RequiredArgsConstructor
public class AccidentControler {
    
    private final AccidentService accidentService;

    @GetMapping
    public List<Accidents> getAllAccidents(){
        return accidentService.getAllAccidents();   
    }
}
