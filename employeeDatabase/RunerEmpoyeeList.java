package employeeDatabase;
import java.util.Scanner;

public class RunerEmpoyeeList {
    EmployeeList employeeList = new EmployeeList();
    Scanner scanner = new Scanner(System.in);

    private void addEmployee() {
        int id = employeeList.getNextUniqueId();
        System.out.println("Set eemployee name: ");
        String name = scanner.nextLine();
        System.out.println("Set eemployee surname: ");
        String surneme = scanner.nextLine();
        System.out.println("Set eemployee age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        employeeList.addEmplpoyee(id, name, surneme, age);
        System.out.println("Added new employee ID: "+id+", name: " + name + ", surneme: " + surneme + ", age: " + age);
    }

    private void removeEmployee() {
        System.out.println("Select employee ID");
        int id = scanner.nextInt();
        scanner.nextLine();
        employeeList.removeEmployee(id);
        System.out.println("Employee ID:" + id + " has removed.");
    }
    private void editEmployee() {
        System.out.println("Select employee ID");
        int id = scanner.nextInt();
        scanner.nextLine();
        employeeList.findByID(id);
        System.out.println("New name: ");
        String newName = scanner.nextLine();
        System.out.println("New surname: ");
        String newSurname = scanner.nextLine();
        System.out.println("New age: ");
        int newAge = scanner.nextInt();
        employeeList.editEmployee(id, newName, newSurname, newAge);
        System.out.println("Employee ID: "+id+" was edited succesfull. New name: "+newName+" new surname: "+newSurname+" new age: "+newAge);
    }
    private void findByName() {
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        employeeList.findByName(name);
    }
    private void findBySurname() {
        System.out.println("Enter surname: ");
        String surname = scanner.nextLine();
        employeeList.findBySurname(surname);
    }
    private void findByNameAndSurname() {
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter surnamre");
        String surname = scanner.nextLine();
        employeeList.findByNameAndSurname(name, surname);
    }
    private void findById() {
        System.out.println("Enter ID");
        int id = scanner.nextInt();
        employeeList.findByID(id);
    }
    private void findByAge() {
        System.out.println("Enter age: ");
        int age = scanner.nextInt();
        employeeList.findByAge(age);
    }
    private void selectionMenu() {
        System.out.println("Select operation: ");
        System.out.println("1 - Add employee");
        System.out.println("2 - Remove employee");
        System.out.println("3 - Displey employees list");
        System.out.println("4 - Save employees list");
        System.out.println("5 - Serch");
        System.out.println("6 - Edit employee");
        System.out.println("7 - Clear employees list");
        System.out.println("8 - Go back");
        System.out.println("9 - Exit");
        char selectedOperation = scanner.next().charAt(0);
        scanner.nextLine();

        switch (selectedOperation) {
            case '1':
                this.addEmployee();
                break;
            case '2':
                this.removeEmployee();
                break;
            case '3':
                employeeList.displayEmployeeList();
                break;
            case '4':
                employeeList.saveList();
                break;
            case '5':
                this.serchMenu();
                break;
            case '6':
                this.editEmployee();
                break;
            case '7':
                employeeList.clearEmployeesList();
                break;
            case '9':
                System.exit(0);
            default:
                System.out.println("Invalid operation");
                break;
        }
    }
    private void serchMenu() {
        System.out.println("1 - serch by name");
        System.out.println("2 - serch by surname");
        System.out.println("3 - serch by name and surname");
        System.out.println("4 - serch by ID");
        System.out.println("5 - serch by age");
        System.out.println("6 - return");

        char serchOperation = scanner.next().charAt(0);
        scanner.nextLine();
        switch (serchOperation) {
            case '1':
                this.findByName();
                break;
            case '2':
                this.findBySurname();
                break;
            case '3':
                this.findByNameAndSurname();
                break;
            case '4':
                this.findById();
                break;
            case '5':
                this.findByAge();
                break;
            case '6':
                this.selectionMenu();
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
    }

    public void RunEmployeeList() {
        System.out.println("Welkom in employees database menager.");
        employeeList.loadList();
        while (true) {
            this.selectionMenu();
            }
        }
    }
