package day_31_Constructors.scrumTask;

public class MyScrumTram {
    public static void main(String[] args) {

    Taster tester1 = new Taster("layan",11,"QA",110000);
        Taster tester2 = new Taster("sunila",13,"SDET",142000);
        Taster tester3 = new Taster("imran",44,"SE",135000);
        Taster tester4 = new Taster("jannat",23,"SDET",115000);

        Taster[] testers = {tester2,tester3,tester4};

        Developer developer1 = new Developer("olga",11,"javav developer",125000);
        Developer developer2= new Developer("Aygun", 39, "Java Master", 185.000);
        Developer developer3 = new Developer("Muhtar", 45879, " Senior Engineer", 250000);
        Developer developer4= new Developer("Sinem", 13, "Senior Developer",200000);

        Developer [] developers = {developer2,developer3,developer4};

          scrumTeam scrum = new scrumTeam("nigara", "hussain","niera",14);
          scrum.addTester(tester1);
          scrum.addDeveloper(developer1);

          scrum.addTesters(testers);
          scrum.addDevelopers(developers);



        System.out.println(scrum);


        System.out.println("------------------------------------------------------");

        for(Taster eachTester : scrum.testersList ){
            System.out.println(eachTester.name + " : "+ eachTester.salary);
        }

        System.out.println("------------------------------------------------------");

        for (Developer eachDeveloper : scrum.devopsList) {
            System.out.println(eachDeveloper.name +" : "+ eachDeveloper.salary);
        }

    }
}
