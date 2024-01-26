package org.example;

import org.example.convertor.ClientXmlToPersonJson;

public class Main {
    public static void main(String[] args) {
        var converter = new ClientXmlToPersonJson();
        converter.createPersonJson();
    }
}