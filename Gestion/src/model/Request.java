package model;

public class Request {

    // atributes
    private String requestDate;
    private String description;
    private int id;
    private String status;
    private String area;
    private String collaborator;
    

    // Constructor
    public Request(String status, int id, String requestDate, String description, String area, String collaborator) {
        this.status = status;
        this.id=id;
        this.requestDate = requestDate;
        this.description = description;
        this.area = area;
        this.collaborator = collaborator;
    }

    // methods
    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCollaborator() {
        return collaborator;
    }

    public void setCollaborator(String collaborator) {
        this.collaborator = collaborator;
    }
    public String toString() {
        String areaInfo = "No area";
        if (area != null) {
            areaInfo = area.toString();
        }

        String collaboratorInfo = "No collaborator";
        if (collaborator != null) {
            collaboratorInfo = collaborator.toString();
        }

        return "Request" +
                "requestDate='" + requestDate + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", area=" + areaInfo +
                ", collaborator=" + collaboratorInfo +
                '}';
    }

}
