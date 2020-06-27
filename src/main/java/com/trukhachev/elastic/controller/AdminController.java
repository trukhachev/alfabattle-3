package com.trukhachev.elastic.controller;

import com.trukhachev.elastic.dto.StatusDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/health")
@RequiredArgsConstructor
public class AdminController {

    @GetMapping
    public ResponseEntity<StatusDTO> health() {

        return new ResponseEntity<>(new StatusDTO().setStatus("UP"), HttpStatus.OK);

    }

}
