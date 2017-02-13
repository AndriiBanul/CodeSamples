package com.wmsengine.controllers;

import com.wmsengine.services.WordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.wmscommon.EnglishWord;

import java.util.List;

/**
 * Created by Andrii_Banul on 2/13/2017.
 */
@RestController
public class WordsController {

    @Autowired
    private WordsService wordsService;

    @RequestMapping("/all-words")
    public List<EnglishWord> getAllWords(){
        return wordsService.getAllWords();
    }
}
