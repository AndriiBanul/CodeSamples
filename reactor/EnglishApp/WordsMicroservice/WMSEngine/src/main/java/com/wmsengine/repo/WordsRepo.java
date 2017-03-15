package com.wmsengine.repo;

import com.wmscommon.EnglishWord;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by Andrii_Banul on 3/9/2017.
 */
public interface WordsRepo extends MongoRepository<EnglishWord, String> {
    public List<EnglishWord> findByEnglish(String english);
    public List<EnglishWord> findByUkrainian(String ukrainian);
    public List<EnglishWord> findByRussian(String russian);
    public EnglishWord findById(String id);
}
