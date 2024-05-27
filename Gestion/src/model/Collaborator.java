package model;

public  class Collaborator {
    //atributes
    private String id;
    private String name;
    private String email;
    private String ext;
    private String type;

    //constructor
    public Collaborator(String id, String name, String email, String ext, String type) {
        this.name = name;
        this.email =email;
        this.id = id;
        this.ext=ext;
        this.type=type;

    }


//methods
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getEmail(){
        return email;   
    }   

    public String getExt(){
        return ext;
    }

    public String getType(){
        return type;
    }

    public String toString() {
        return "ID: " + id + "\n" +
               "Name: " + name + "\n" +
               "Email: " + email + "\n" +
               "Extension: " + ext + "\n";
    }
}