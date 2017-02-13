package com.englishapp.engine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Andrii_Banul on 2/6/2017.
 */
@SpringBootApplication
public class EnglishEngineMain {
    public static void main(String[] args) {
        SpringApplication.run(EnglishEngineMain.class, "--debug");
    }
}
