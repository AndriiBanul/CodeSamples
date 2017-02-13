package com.wmsengine.services;

import com.wmscommon.EnglishWord;
import com.wmsengine.dao.WordsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Andrii_Banul on 2/13/2017.
 */
@Component
public class WordsService {

    @Autowired
    private WordsDao wordsDao;

    public List<EnglishWord> getAllWords(){
        return wordsDao.getAllWords();
    }
}
