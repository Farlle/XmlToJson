package org.example.jsoninfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("PersonInfo")
public class PersonInfo {
    @JsonProperty("FindPersonINfo")
    private FindPersonInfo findPersonInfo;

    public PersonInfo(FindPersonInfo findPersonInfo) {
        this.findPersonInfo = findPersonInfo;
    }

    public FindPersonInfo getFindPersonInfo() {
        return findPersonInfo;
    }
}
