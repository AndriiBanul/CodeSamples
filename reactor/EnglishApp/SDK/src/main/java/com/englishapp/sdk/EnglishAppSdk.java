package com.englishapp.sdk;

import com.englishapp.sdk.service.EnglishAppSdkService;
import com.wmscommon.EnglishWord;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Andrii_Banul on 2/6/2017.
 */
public class EnglishAppSdk {

    @Autowired
    protected EnglishAppSdkService englishAppSdkService;

    public List<EnglishWord> getWords(){
        return englishAppSdkService.getWords();
    }

}
