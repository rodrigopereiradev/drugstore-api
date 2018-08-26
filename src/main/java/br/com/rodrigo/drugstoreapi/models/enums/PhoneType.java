package br.com.rodrigo.drugstoreapi.models.enums;

public enum PhoneType {

    PHONE("phone"), CELLPHONE("cellphone");

    private String phoneType;

    PhoneType(String phoneType) {
        this.phoneType = phoneType;
    }
}
