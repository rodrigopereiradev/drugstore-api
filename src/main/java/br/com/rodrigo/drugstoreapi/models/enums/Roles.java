package br.com.rodrigo.drugstoreapi.models.enums;

public enum Roles {

    SYSTEM_ADMINISTRATOR("System Administrator"),
    SALES_MANAGER("Sales Manager"),
    SELLER("Seller"),
    CLIENT("Client");

    private String name;

    Roles(String name) {
        this.name = name;
    }

    public String getValue() {
        return this.name;
    }
}
