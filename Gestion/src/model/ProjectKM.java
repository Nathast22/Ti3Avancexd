package model;

public class ProjectKM extends Project {
    // atributes
    String processName;
    String community;
    String processType;

    // constructor
    public ProjectKM(int id, String name, String status, String date, int priority, String leader, int timeClose,
            String processName, String community, String processType) {

        super(id, name, status, date, priority, leader, timeClose);

        this.processName = processName;
        this.community = community;
        this.processType = processType;

    }

    // methods
    public String getProcessName() {
        return processName;
    }

    public String getCommunity() {
        return community;
    }

    public String getProcessType() {
        return processType;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public void setProcessType(String processType) {
        this.processType = processType;
    }

}
