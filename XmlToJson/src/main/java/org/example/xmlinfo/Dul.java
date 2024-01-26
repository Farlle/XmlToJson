package org.example.xmlinfo;

public class Dul {
    private int documentType;
    private int number;
    private int series;

    private String firstName;
    private String lastName;
    private String secondName;

    public Dul() {
    }

    public Dul(int documentType, int number, int series, String firstName, String lastName, String secondName) {
        this.documentType = documentType;
        this.number = number;
        this.series = series;
        this.firstName = firstName;
        this.lastName = lastName;
        this.secondName = secondName;
    }

    public int getDocumentType() {
        return documentType;
    }

    public int getNumber() {
        return number;
    }

    public int getSeries() {
        return series;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSecondName() {
        return secondName;
    }
}
