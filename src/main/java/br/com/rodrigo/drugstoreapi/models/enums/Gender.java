package br.com.rodrigo.drugstoreapi.models.enums;

public enum Gender {
    MALE("M"), FEMALE("F");

    private String gender;

    Gender(String gender) {
        this.gender = gender;
    }
}
