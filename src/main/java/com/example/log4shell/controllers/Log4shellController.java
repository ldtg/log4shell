package com.example.log4shell.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Log4shellController {
    private static final Logger logger = LogManager.getLogger("Log4shellController");

    @PostMapping("/ping")
    public String Ping(@RequestHeader(value = "Log", required = false) String logMessage) {
        logger.info("log " + logMessage);
        return "Pong";
    }

}
