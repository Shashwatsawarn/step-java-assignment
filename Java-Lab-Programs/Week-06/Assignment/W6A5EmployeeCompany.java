class CompanyEmployee {
    String empName;
    double salary;
    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    CompanyEmployee(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }
}

public class W6A5EmployeeCompany {
    public static void main(String[] args) {
        new CompanyEmployee("Asha", 50000);
        new CompanyEmployee("Kiran", 55000);
        new CompanyEmployee("Meera", 60000);
        CompanyEmployee.printCompanyInfo();
    }
}
