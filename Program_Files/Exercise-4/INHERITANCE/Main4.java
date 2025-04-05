class Company {
    protected String name;

    public Company(String name) {
        this.name = name;
    }

    public void displayCompany() {
        System.out.println("Company Name: " + name);
    }
}

class Department extends Company {
    protected String departmentName;

    public Department(String name, String departmentName) {
        super(name);
        this.departmentName = departmentName;
    }

    public void displayDepartment() {
        System.out.println("Department: " + departmentName);
    }
}

class Team extends Department {
    private String teamName;

    public Team(String name, String departmentName, String teamName) {
        super(name, departmentName);
        this.teamName = teamName;
    }

    public void displayTeam() {
        System.out.println("Team: " + teamName);
    }
}

public class Main4 {
    public static void main(String[] args) {
        Team team = new Team("TechCorp", "Engineering", "Backend Development");
        team.displayCompany();
        team.displayDepartment();
        team.displayTeam();
    }
}
