package com.englishapp.sdk.service;

import com.wmscommon.EnglishWord;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrii_Banul on 2/6/2017.
 */

@Component
public class EnglishAppSdkService {

    public List<EnglishWord> getWords() {
        //TODO: add restcall here
        ArrayList<EnglishWord> words = new ArrayList<EnglishWord>();
        return words;
    }
}
