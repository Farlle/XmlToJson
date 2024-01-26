package org.example.convertor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.example.jsoninfo.FindPersonInfo;
import org.example.jsoninfo.IdentityCard;
import org.example.jsoninfo.PersonInfo;
import org.example.jsoninfo.PersonName;
import org.example.xmlinfo.ClientInfo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ClientXmlToPersonJson {

    private static final String CLIENT_PATH_XML = "src/main/resources/ClientInfo.xml";
    private static final String PERSON_PATH_JSON = "src/main/resources/PersonInfo.json";

    private PersonInfo clientToPerson(ClientInfo clientInfo) {
        var dul = clientInfo.getClientFindInfo().getDul();
        var personName = new PersonName(dul.getLastName(), dul.getFirstName(), dul.getSecondName());
        var identityCard = new IdentityCard(dul.getDocumentType(), dul.getSeries(), dul.getNumber());
        var partyId = clientInfo.getClientFindInfo().getPartyId();
        var findPersonInfo = new FindPersonInfo(personName, identityCard, partyId);
        return new PersonInfo(findPersonInfo);
    }

    public ClientInfo getClientFromXML() {
        var xmlMapper = new XmlMapper();
        ClientInfo clientInfo;
        try {
            var inputStream = new FileInputStream(CLIENT_PATH_XML);
            clientInfo = xmlMapper.readValue(inputStream, ClientInfo.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return clientInfo;
    }

    public void createPersonJson() {
        var objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        try {
            var personInfo = clientToPerson(getClientFromXML());
            var jsonWriter = new File(PERSON_PATH_JSON);
            objectMapper.writeValue(jsonWriter, personInfo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
