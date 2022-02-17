package day31_Constructors.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class scrumTeam {

    public String PO,BA,SM;
    public ArrayList<Taster> testersList = new ArrayList<>();
    public ArrayList<Developer> devopsList = new ArrayList<>();
    public int daysOfSprint;


    public scrumTeam(String PO, String BA, String SM, int daysOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.daysOfSprint = daysOfSprint;




    }


    public void addTester(Taster tester){
        testersList.add(tester);
    }

    public void addTesters(Taster[] tasters){
        testersList.addAll(Arrays.asList(tasters));

    }

    public void addDeveloper(Developer developer){
        devopsList.add(developer);
    }

    public void addDevelopers(Developer[] developers){
        devopsList.addAll(Arrays.asList(developers));
    }

    public void removeTester(int employeeID){
        testersList.removeIf(p -> p.employeeID == employeeID);
    }

    public void removedeveloper(int empolyeeID){
        testersList.removeIf(p -> p.employeeID == empolyeeID);
    }


    public String toString() {
        return "scrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", total number of testers=" + testersList +
                ", total number of developers=" + devopsList +
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }
}
