package model;

import java.util.ArrayList;
import java.util.Random;

public class Controller {
    // atributes
    private String name;
    private String type;
    private ArrayList<Collaborator> listCollaborator;
    private ArrayList<Area> listArea;
    private ArrayList<Request> listRequests;
    private ArrayList<Project> listProjects;


    // constructor
    public Controller(String name, String type) {
        this.name = name;
        this.type = type;
        listCollaborator = new ArrayList<>();
        listArea = new ArrayList<>();
        listRequests = new ArrayList<>();
        listProjects = new ArrayList<>();
    }

    // methods
    public void registerArea(String name, String office, String collaboratorId, int code) {
        listArea.add(new Area(name, office, collaboratorId, code));
    }


    public boolean available() {
        return true;
    }
    public Request searchRequest(int id) {
        for (int i = 0; i < listRequests.size(); i++) {
            Request request = listRequests.get(i);
            if (request.getId()==id)
                return request;
        }
        return null;
    }
    public Collaborator searchCollaborator(String id) {
        for (int i = 0; i < listCollaborator.size(); i++) {
            Collaborator collaborator = listCollaborator.get(i);
            if (collaborator.getId().equalsIgnoreCase(id))
                return collaborator;
        }
        return null;
    }
   

     public String addCollaborator(String id, String name, String email, String ext, String type) {
        String message = "";
        if (searchCollaborator(id) == null) {
                listCollaborator.add(new Collaborator(id, name, email, ext, type));
                message = "Collaborator added!";
            }
        else {
            message = "ERROR! Collaborator already exists";
        }
        return message;
    
    }
    private boolean idnotnull(int id) {
        for (Request request : listRequests) {
            if (request.getId() == id) {
                return false;
            }
        }
        return true;
    }

    private int generateId(Random random) {
        int id;
        do {
            id = random.nextInt(1000, 9999);
        } while (!idnotnull(id));
        return id;
    }

    public String registerRequest(String status, String date, String description, String area, String collaboratorArea, Random random) {
        String message="";
        int id = generateId(random);
        Collaborator collaborator = searchCollaborator(collaboratorArea);
        if (collaborator == null) {
            message= "ERROR! Collaborator not found";
        }
        if (area == null) {
            message= "ERROR! Area not found";
        }
        listRequests.add(new Request(status, id, date, description, area, collaboratorArea));
        message+="\nRequest registered at " + date ;
        message+=" \nAssigned to collaborator: " + collaborator.getName();
        message+= "\nREQUEST ID: >>>" + id + "<<< Please save this number";
        return message;
        }

        public String rejectRequest(int id) {
           Request request = searchRequest(id);
            if (request != null) {
                listRequests.remove(request);
                return "Request with ID " + id + " has been successfully rejected and removed from the system";
            } else {
                return "Request not found!";
            }
        }

    public newProject(int id, name, status, date, priority, leader, timeClose, type,processName, community, processType)



}

    

