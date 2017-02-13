package com.wmssdk;

import com.wmscommon.EnglishWord;
import com.wmssdk.service.WMSSdkService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Andrii_Banul on 2/6/2017.
 */
public class WMSSdk {

    @Autowired
    private WMSSdkService wmsSdkService;

    public List<EnglishWord> getWords(){
        return wmsSdkService.getWords();
    }
}
