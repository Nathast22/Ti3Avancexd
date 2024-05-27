package model;

public abstract class Project {

    // atributes
    private int id;
    private String name;
    private String status;
    private String date;
    private int priority;
    private String leader;
    private int timeClose;

    // constructor
    public Project(int id, String name, String status, String date, int priority, String leader, int timeClose) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.date = date;
        this.priority = priority;
        this.leader = leader;
        this.timeClose = timeClose;
    }

    // methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public int getTimeClose() {
        return timeClose;
    }

    public void setTimeClose(int timeClose) {
        this.timeClose = timeClose;
    }

}
