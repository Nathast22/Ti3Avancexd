package model;

public class Area {

    // atributes
    private String name;
    private String office;
    private int code;
    private String collaboratorID;

    // constructor
    public Area(String name, String office, String collaboratorID, int code) {
        this.name = name;
        this.office = office;
        this.code = code;
        this.collaboratorID = collaboratorID;
    }

    // methods
    public String getName() {
        return name;
    }

    public String getOffice() {
        return office;
    }

    public int getCode() {
        return code;
    }

    public String getCollaboratorID() {
        return collaboratorID;
    }

    public String toString() {
        return "Area Name: " + name + "\n" +
                "Office: " + office + "\n" +
                "Code: " + code + "\n" +
                "Collaborator in Charge: " + collaboratorID + "\n";
    }
}