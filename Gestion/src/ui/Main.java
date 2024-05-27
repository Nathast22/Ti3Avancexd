package ui;

import java.util.Random;
import java.util.Scanner;

import model.Controller;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        Random random = new Random();
        Controller objU = new Controller("icesi", "private");

        objU.addCollaborator("03052020", "Dulce Maria", "dulce@gmail.com", "554", "TI");
        objU.addCollaborator("09050006", "Tomas", "rolo@gmail.com", "104", "TI");
        objU.addCollaborator("19179667", "Alberto", "beto@gmail.com", "046", "TI");
        objU.addCollaborator("20078101", "Mario", "mario@gmail.com", "113", "TI");

        objU.addCollaborator("100548759", "Giovanny", "Gtrk@icesi.edu.co", "196", "General");
        objU.addCollaborator("117548750", "Bruno", "brunoZA@icesi.edu.co", "203", "General");
        objU.addCollaborator("11548320", "Gloria", "GloriaSW@icesi.edu.co", "259", "General");
        objU.addCollaborator("101410588", "Selene", "seleneSM@icesi.edu.co", "016", "General");
        objU.addCollaborator("97584625", "Lucas", "LukaDP@icesi.edu.co", "207", "General");
        objU.addCollaborator("69785333", "Elizabeth", "liliieAE@icesi.edu.co", "241", "General");

        objU.registerArea("Executive Office", "Building A", "100548759", 5690);
        objU.registerArea("Management and Finance Office", "Building A", "117548750", 1111);
        objU.registerArea("School of Engineering and Exact Sciences", "Building E", "11548320", 0305);
        objU.registerArea("School of Medical Sciences", "Building L", "101410588", 0462);
        objU.registerArea("School of Administrative", "Building D", "97584625", 1901);
        objU.registerArea("School of Humanities", "Building M", "69785333", 1028);

////////////////////////////////////////Menu////////////////////////////////////////////////////////////////////////////////
do {
    int option = menu();
    switch (option) {
        case 1:
            addCollaborator(objU);
            break;
        case 2:
            registerRequest(objU, random);
            break;
        case 3:
            updateRequestStatus(objU);
            break;
        case 4:
            // searchProjects(objU);
            break;
        case 5:
            // showProjectInfo(objU);
            break;
        case 6:
            // calculateEfficiency(objU);
            break;
        case 7:
            // queries(objU);
            break;
        case 8:
            testCases(objU, random);
            break;
        case 0:
            exit = true;
            System.out.println("closing the app...... ");
            break;
        default:
            System.out.println("Enter a VALID OPTION please");
    }
} while (!exit);
}

            
    public static int menu() {
        System.out.println("(1) Add collaborator ");
        System.out.println("(2) Register a Request");
        System.out.println("(3) Update a Request's Status ");
        System.out.println("(4) Search Projects by date ");
        System.out.println("(5) Query a Project's Information  ");
        System.out.println("(6) Calculate Efficiency ");
        System.out.println("(7) Global indicators Queries ");
        System.out.println("(8) Create testCases ");
        System.out.println("(0) Exit app");
        System.out.println("\n-----------------------------------------------------------------");

        System.out.print("Please enter your Option: ");
        return input.nextInt();
    }
///////////////////////////////METHODS/////////////////////////////////////////////////////
    public static void addCollaborator(Controller objIcesi) {
        input.nextLine();
        String id, name, email, ext, type;
        type = "General";
        System.out.println("Id : ");
        id = input.nextLine();

        System.out.println("Name : ");
        name = input.nextLine();

        System.out.println("Email : ");
        email = input.nextLine();
        System.out.println("Extension : ");
        ext = input.nextLine();

        String message = objIcesi.addCollaborator(id, name, email, ext, type);
        System.out.println(".....................................");
        System.out.println(message);
        System.out.println(".....................................");
    }
///////////////////////////////////////////////////////////////////////////////////////////////////
    public static void registerRequest(Controller objIcesi, Random random) {
        String status = "pending";
        input.nextLine();
        System.out.println("Registration Date (dd/mm/yyyy): ");
        String date = input.nextLine();
        System.out.println("Request Description :");
        String description = input.nextLine();
        System.out.println(" \nSelect the Area that requests it :");
        System.out.println("(1) Management office ");
        System.out.println("(2) Management and Finance Office");
        System.out.println("(3) School of Engineering and Exact Sciences ");
        System.out.println("(4) School of Medical Sciences ");
        System.out.println("(5) School of Administrative");
        System.out.println("(6) School of Humanities ");
        String area = input.nextLine();

        String collaboratorArea = "";
        switch (area) {
            case "1":
                area = "Management office";
                collaboratorArea = "100548759";
                break;
            case "2":
                area = "Management and Finance Office";
                collaboratorArea = "117548750";
                break;
            case "3":
                area = "School of Engineering and Exact Sciences";
                collaboratorArea = "11548320";
                break;
            case "4":
                area = "School of Medical Sciences";
                collaboratorArea = "101410588";
                break;
            case "5":
                area = "School of Administrative";
                collaboratorArea = "97584625";
                break;
            case "6":
                area = "School of Humanities";
                collaboratorArea = "69785333";
                break;
            default:
                System.out.println("Invalid option");
                break;
        }

        String message = objIcesi.registerRequest(status, date, description, area, collaboratorArea, random);
        System.out.println(".....................................");
        System.out.println(message);
        System.out.println(".....................................");
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void updateRequestStatus(Controller objIcesi) {
        int option;
        String message = "";
        System.out.println("\nEnter your Option :");
        System.out.println("(1) Approve request and register as project");
        System.out.println("(2) Reject Request");
        option = input.nextInt();
        input.nextLine();

        switch (option) {
            case 1:
                System.out.println("Enter the ID of the request that will be approved :");
                int id = input.nextInt();
                input.nextLine(); 
                System.out.println("Name of the New Project :");
                String name = input.nextLine();
                String status = "current";
                System.out.println("approval date (dd/mm/yyy):");
                String date = input.nextLine();
                System.out.println("Priority :");
                System.out.println("(1)Urgent");
                System.out.println("(2)High");
                System.out.println("(3)Medium");
                System.out.println("(4)Low");
                int priority = input.nextInt();
                input.nextLine(); 

                int timeClose = 0;
                switch (priority) {
                    case 1:
                        timeClose = 5;
                        break;
                    case 2:
                        timeClose = 10;
                        break;
                    case 3:
                        timeClose = 30;
                        break;
                    case 4:
                        timeClose = 60;
                        break;
                    default:
                        System.out.println("Invalid option");
                        break;
                }

                System.out.println("Project Leader ID (Collaborator of the TI area) :");
                String leader = input.nextLine();

                System.out.println("Type of Project : (Enter KM/TI)");
                System.out.println("(KM)Knowledge management project");
                System.out.println("(TI)Transformation and improvement project");
                String type = input.nextLine().toUpperCase();
                while (!type.equals("KM") && !type.equals("TI")) {
                    System.out.println("Invalid option, please enter KM or TI ");
                    type = input.nextLine().toUpperCase();
                }

                switch (type) {
                    case "KM":
                        System.out.println("\nSuggested name of the process to be managed :");
                        String processName = input.nextLine();
                        System.out.println("Impacted community (Students/Teachers/Administratives)");
                        String community = input.nextLine().toLowerCase();
                        while (!community.equals("students") && !community.equals("teachers")
                                && !community.equals("administratives")) {
                            System.out.println("Invalid option, please enter Students/Teachers/Administratives ");
                            community = input.nextLine().toLowerCase();
                        }
                        System.out.println("Process Type :");
                        System.out.println("(1)Standardization");
                        System.out.println("(2)Documentation");
                        System.out.println("(3)Optimization");
                        String processType = input.nextLine();

                        switch (processType) {
                            case "1":
                                processType = "Standardization";
                                break;
                            case "2":
                                processType = "Documentation";
                                break;
                            case "3":
                                processType = "Optimization";
                                break;
                            default:
                                System.out.println("Invalid option");
                                
                        }
                        message = objIcesi.newProject(id, name, status, date, priority, leader, timeClose, type,processName, community, processType);
                        System.out.println(".....................................");
                        System.out.println(message);
                        System.out.println(".....................................");
                        break;

                    case "TI":
                        
                        // message = objIcesi.newProject(id, name, status, date, priority, leader,
                        // timeClose, type, DEMAS ATRIBUTeS DE TI);
                        break;

                    default:
                        System.out.println("Invalid option");
                       break; 
                }
                break;

            case 2:
                System.out.println("Enter the ID of the request that will be rejected :");
                id = input.nextInt();
                message = objIcesi.rejectRequest(id);
                System.out.println(".....................................");
                System.out.println(message);
                System.out.println(".....................................");
                break;

            default:
                System.out.println("please enter 1 or 2");
                break;
        }
    }

    public static void testCases(Controller objIcesi, Random random) {
        objIcesi.registerRequest("pending", "07/05/2024", "Icesi INNteractive organization", "Management office",
                "100548759", random);
    }
}
