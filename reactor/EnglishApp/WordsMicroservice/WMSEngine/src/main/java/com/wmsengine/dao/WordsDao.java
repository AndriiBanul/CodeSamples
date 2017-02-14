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
        EnglishWord word1 = new EnglishWord();
        EnglishWord word2 = new EnglishWord();
        EnglishWord word3 = new EnglishWord();
        EnglishWord word4 = new EnglishWord();
        word1.setEnglish("Horse");
        word1.setUkrainian("Кінь");
        word1.setId("1");

        word2.setEnglish("Mouse");
        word2.setUkrainian("Миша");
        word2.setId("2");

        word3.setEnglish("Pig");
        word3.setUkrainian("Свиня");
        word3.setId("3");

        word4.setEnglish("Apple");
        word4.setUkrainian("Яблуко");
        word4.setId("4");

        englishWords.add(word1);
        englishWords.add(word2);
        englishWords.add(word3);
        englishWords.add(word4);
        return englishWords;
    }
}
