import java.util.Scanner;

class Employee {
  protected String empName;
  protected int empId;
  protected String address;
  protected String mailId;
  protected String mobileNo;
  protected double basicPay;

  public Employee(String empName, int empId, String address, String mailId, String mobileNo, double basicPay) {
    this.empName = empName;
    this.empId = empId;
    this.address = address;
    this.mailId = mailId;
    this.mobileNo = mobileNo;
    this.basicPay = basicPay;
  }

  public double calculateDA() {
    return 0.97 * basicPay;
  }

  public double calculateHRA() {
    return 0.1 * basicPay;
  }

  public double calculatePF() {
    return 0.12 * basicPay;
  }

  public double calculateStaffClubFund() {
    return 0.001 * basicPay;
  }

  public double calculateGrossSalary() {
    return basicPay + calculateDA() + calculateHRA();
  }

  public double calculateNetSalary() {
    return calculateGrossSalary - calculatePF() - calculateStaffClubFund();
  }

  public void generatePaySlip() {
    System.out.println("--- Pay Slip---");
    System.out.println("Employee Name:" + empName);
    System.out.println("Employee ID:" + empId);
    System.out.println("Address:" + address);
    System.out.println("Email:" + mailId);
    System.out.println("Basic Pay:" + basicPay);
    System.out.println("DA:" + calculateDA());
    System.out.println("HRA:" + calculateHRA());
    System.out.println("PF:" + calculatePF());
    System.out.println("Staff club fund:" + calculateStaffClubFund());
    System.out.println("Gross Salary:" + calculateGrossSalary());
    System.out.println("Net Salary:" + calculateNetSalary());
    System.out.println("---------------------");

  }
}

class Programmer extends Employee {
  public Programmer(String empName, int empId, String address, String mailId, String mobileNo, double basicPay) {
    super(empName, empId, address, mailId, mobileNo, basicPay);
  }
}

class TeamLead extends Employee {
  public TeamLead(String empName, int empId, String address, String mailId, String mobileNo, double basicPay) {
    super(empName, empId, address, mailId, mobileNo, basicPay);
  }

  @Override
  public double calculateHRA() {
    return 0.15 * basicPay;
  }
}

class AssistantProjectManager extends Employee {
  public AssistantProjectManager(String empName, int empId, String address, String mailId, String mobileNo,
      double basicPay) {
    super(empName, empId, address, mailId, mobileNo, basicPay);
  }
}

class ProjectManager extends Employee {
  public ProjectManager(String empName, int empId, String address, String mailId, String mobileNo, double basicPay) {
    super(empName, empId, address, mailId, mobileNo, basicPay);
  }

  @Override
  public double calculateHRA() {
    return 0.20 * basicPay;
  }
}

public class Challenge4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter employee name:");
    String empName = sc.nextLine();
    System.out.print("Enter employee Id:");
    int empId = sc.nextInt();
    sc.nextLine();
    System.out.print("Enter address:");
    String address = sc.nextLine();
    System.out.print("Enter E-mail:");
    String mailId = sc.nextLine();
    System.out.print("Enter mobile no:");
    String mobileNo = sc.nextLine();
    System.out.print("Enter basic pay:");
    double basicPay = sc.nextDouble();
    Employee employee;
    System.out.println("Select employee type:");
    System.out.println("1.Programmer");
    System.out.println("2.Team Lead");
    System.out.println("3.Assistant Project Manager");
    System.out.println("4.Project Manager");
    System.out.print("Enter choice:");
    int choice = sc.nextInt();
    switch (choice) {
      case 1:
        employee = new Programmer(empName, empId, address, mailId, mobileNo, basicPay);
        break;
      case 2:
        employee = new TeamLead(empName, empId, address, mailId, mobileNo, basicPay);
        break;

      case 3:
        employee = new AssistantProjectManager(empName, empId, address, mailId, mobileNo, basicPay);
        break;

      case 4:
        employee = new ProjectManager(empName, empId, address, mailId, mobileNo, basicPay);
        break;

      default:
        System.out.println("Invalid choice. Creating programmer by choice");
        employee = new Programmer(empName, empId, address, mailId, mobileNo, basicPay);
    }
    employee.generatePaySlip();
    sc.close();
  }
}