package br.com.rodrigo.drugstoreapi.models;

public enum Gender {
    M("male"), F("female");

    private String gender;

    Gender(String gender) {
        this.gender = gender;
    }
}
