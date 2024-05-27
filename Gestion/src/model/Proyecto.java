package model;

public class Proyecto {
    private String name;
    private double investment;
    private String role;

    public Proyecto(String name, double investment, String role) {
        this.name = name;
        this.investment = investment;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getInvestment() {
        return investment;
    }

    public void setInvestment(double investment) {
        this.investment = investment;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
