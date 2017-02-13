package com.wmssdk.service;

import com.wmscommon.EnglishWord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Andrii_Banul on 2/6/2017.
 */
public class WMSSdkService {

    @Autowired
    private RestTemplate restTemplate;

    public List<EnglishWord> getWords(){
        EnglishWord[] words = restTemplate.getForObject("url", EnglishWord[].class);
        return Arrays.asList(words);
    }
}
