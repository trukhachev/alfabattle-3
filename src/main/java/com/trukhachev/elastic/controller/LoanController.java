package com.trukhachev.elastic.controller;

import com.trukhachev.elastic.dto.StatusDTO;
import com.trukhachev.elastic.handler.LoanHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loans")
@RequiredArgsConstructor
public class LoanController {

    private final LoanHandler loanHandler;

    @PostMapping(value = "/loadPersons")
    public ResponseEntity<StatusDTO> loadPersons() {

       var status = loanHandler.loadPersons();

       return new ResponseEntity<>(status, HttpStatus.OK);
    }

    @PostMapping(value = "/loadLoans")
    public ResponseEntity<StatusDTO> loadLoans() {

        var status = loanHandler.loadLoans();

        return new ResponseEntity<>(status, HttpStatus.OK);
    }


}
