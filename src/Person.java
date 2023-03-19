public class Person {
    private String name;
    private String sureName;
    private int quantityTicket;

    public Person(String name, String sureName, int quantityTicket) {
        this.name = name;
        this.sureName = sureName;
        this.quantityTicket = quantityTicket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public int getQuantityTicket() {
        return quantityTicket;
    }

    public void setQuantityTicket(int quantityTicket) {
        this.quantityTicket = quantityTicket;
    }
}
