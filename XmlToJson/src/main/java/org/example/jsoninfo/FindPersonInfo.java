package org.example.jsoninfo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FindPersonInfo {
    @JsonProperty("PersonName")
    private PersonName personName;
    @JsonProperty("IdentityCard")
    private IdentityCard identityCard;
    @JsonProperty("PartyID")
    private int partyId;



    public FindPersonInfo(PersonName personName, IdentityCard identityCard, int partyId) {
        this.personName = personName;
        this.identityCard = identityCard;
        this.partyId = partyId;
    }

    public PersonName getPersonName() {
        return personName;
    }

    public IdentityCard getIdentityCard() {
        return identityCard;
    }

    public int getPartyId() {
        return partyId;
    }
}
