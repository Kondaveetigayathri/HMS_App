package com.hospital.controllers;

import com.hospital.models.Doctor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class VersionController {

    @GetMapping
    public String getVersion() {
        return "Version : 0.0.1";
    }
}
