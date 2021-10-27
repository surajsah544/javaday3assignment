import java.util.Scanner;
class Employee {
    int eid;       
    String ename;   
    String desg;   
    static String dept; 
    float salary;   

    void inputDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter eid: ");
        eid = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        ename = sc.nextLine();
        System.out.print("Enter designation: ");
        desg = sc.nextLine();
        System.out.print("Enter department: ");
        dept = sc.nextLine();
        System.out.print("Enter salary: ");
        salary = sc.nextFloat();
    }
    void showDetails() {
        System.out.println("Employee Details: ");
        System.out.println("EID: " + eid);
        System.out.println("Name: " + ename);
        System.out.println("Department: " + dept);
        System.out.println("Designation: " + desg);
        System.out.println("Salary: " + salary);
    }
}

class DriveEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        //Employee e2 = new Employee();
        //Employee e3 = new Employee();

        e1.inputDetails();
        //e2.inputDetails();
        //e3.inputDetails();

        e1.showDetails();
        //e2.showDetails();
        //e3.showDetails();
        
    }
}
