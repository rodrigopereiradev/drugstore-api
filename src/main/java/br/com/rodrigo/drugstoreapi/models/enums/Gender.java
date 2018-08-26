package br.com.rodrigo.drugstoreapi.models.enums;

public enum Gender {
    M("male"), F("female");

    private String gender;

    Gender(String gender) {
        this.gender = gender;
    }
}
