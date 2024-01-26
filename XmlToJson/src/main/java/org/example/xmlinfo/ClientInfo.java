package org.example.xmlinfo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "clientInfo")
public class ClientInfo {
    ClientFindInfo clientFindInfo;

    public ClientInfo() {
    }

    public ClientInfo(ClientFindInfo clientFindInfo){
        this.clientFindInfo = clientFindInfo;
    }

    public ClientFindInfo getClientFindInfo(){
        return clientFindInfo;
    }

}
