package com.wmscommon;

/**
 * Created by Andrii_Banul on 2/6/2017.
 */

import org.springframework.data.annotation.Id;

public class EnglishWord {

    private String english;
    private String ukrainian;
    private String russian;
    @Id
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getUkrainian() {
        return ukrainian;
    }

    public void setUkrainian(String ukrainian) {
        this.ukrainian = ukrainian;
    }

    public String getRussian() {
        return russian;
    }

    public void setRussian(String russian) {
        this.russian = russian;
    }
}
