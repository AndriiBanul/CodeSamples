package com.wmsengine.dao;

import com.wmscommon.EnglishWord;
import com.wmsengine.repo.WordsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * Created by Andrii_Banul on 2/13/2017.
 */
@Component
public class WordsDao {

    @Autowired
    private WordsRepo wordsRepo;

    public List<EnglishWord> getAllWords() {
        /*List<EnglishWord> englishWords = new ArrayList<EnglishWord>();
        EnglishWord word1 = new EnglishWord();
        EnglishWord word2 = new EnglishWord();
        EnglishWord word3 = new EnglishWord();
        EnglishWord word4 = new EnglishWord();
        EnglishWord word5 = new EnglishWord();
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

        word5.setEnglish("New");
        word5.setUkrainian("Новий");
        word5.setId("5");*/

/*
        englishWords.add(word1);
        englishWords.add(word2);
        englishWords.add(word3);
        englishWords.add(word4);
        englishWords.add(word5);
*/

       /* wordsRepo.save(word1);
        wordsRepo.save(word2);
        wordsRepo.save(word3);
        wordsRepo.save(word4);
        wordsRepo.save(word5);*/

/*
        EnglishWord word1 = new EnglishWord();
        word1.setEnglish("Car");
        word1.setUkrainian("Машина");
        word1.setId("6");
        wordsRepo.save(word1);
*/


        List<EnglishWord> res = wordsRepo.findByEnglish("Mouse");

        return res;
    }
}
