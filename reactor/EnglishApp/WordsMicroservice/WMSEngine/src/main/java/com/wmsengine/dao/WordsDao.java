package com.wmsengine.dao;

import com.wmscommon.EnglishWord;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrii_Banul on 2/13/2017.
 */
@Component
public class WordsDao {

    public List<EnglishWord> getAllWords() {
        List<EnglishWord> englishWords = new ArrayList<EnglishWord>();
        return englishWords;
    }
}
