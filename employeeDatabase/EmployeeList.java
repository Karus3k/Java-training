package employeeDatabase;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class EmployeeList {
    private ArrayList<Employee> employees;

    public EmployeeList() {
        employees = new ArrayList<>();
    }
    public int getNextUniqueId() {
        ArrayList<Integer> idList = new ArrayList<Integer>();
        for (Employee employee : employees) {
            idList.add(employee.getId());
        }

        Set<Integer> uniqueIds = new HashSet<Integer>(idList);
        int nextId = 1;
        while (uniqueIds.contains(nextId)) {
            nextId++;
        }
        return nextId;
    }

    public void addEmplpoyee(int id, String name, String surname, int age) {
            employees.add(new Employee(id, name, surname, age));
        }

    public void removeEmployee(int id) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == id) {
                employees.remove(i);
            }
        }
    }

    public void displayEmployeeList() {
        if (employees.isEmpty()) {
            System.out.println("List is empty");
        } else {
            for (Employee employee : employees) {
                System.out.println("ID: " + employee.getId() + " Name: " + employee.getName() + " Surname: " + employee.getSurname() + " Age: " + employee.getAge());
            }
        }
    }
    public void editEmployee(int id, String name, String surname, int age) {
        for (Employee employee : employees) {
            if (employee.getId()==id) {
                employee.setName(name);
                employee.setSurname(surname);
                employee.setAge(age);
            }
        }
    }
    public void clearEmployeesList() {
        employees.clear();
    }

    public void saveList() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("EmployeeList.txt"));
            for (Employee employee : employees) {
                writer.write(employee.getId() + " " + employee.getName() + " " + employee.getSurname() + " " + employee.getAge());
                writer.newLine();
            }
            writer.close();
            System.out.println("Plik został zapisany pomyślnie.");
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas zapisywania pliku.");
            e.printStackTrace();
        }
    }

    public void loadList() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("EmployeeList.txt"));
            String linia;
            while ((linia = reader.readLine()) != null) {
                String[] dane = linia.split(" ");
                int id = Integer.parseInt(dane[0]);
                String name = dane[1];
                String surname = dane[2];
                int age = Integer.parseInt(dane[3]);
                employees.add(new Employee(id, name, surname, age));
            }
            System.out.println("Employees list loaded");
            reader.close();
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas odczytywania pliku.");
            e.printStackTrace();
        }
    }

    public void findByName(String name) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                System.out.println("ID: " + employee.getId() + " Name: " + employee.getName() + " Surname:" + employee.getSurname() + " Age: " + employee.getAge());
            }
        }
    }

    public void findBySurname(String surname) {
        for (Employee employee : employees) {
            if (employee.getSurname().equals(surname)) {
                System.out.println("ID: " + employee.getId() + " Name: " + employee.getName() + " Surname:" + employee.getSurname() + " Age: " + employee.getAge());
            }
        }
    }
    public void findByAge(int age) {
        for (Employee employee : employees) {
            if (employee.getAge()==age) {
                System.out.println("ID: " + employee.getId() + " Name: " + employee.getName() + " Surname:" + employee.getSurname() + " Age: " + employee.getAge());
            }
        }
    }
    public void findByID(int id) {
        for (Employee employee : employees) {
            if (employee.getId()==id) {
                System.out.println("ID: " + employee.getId() + " Name: " + employee.getName() + " Surname:" + employee.getSurname() + " Age: " + employee.getAge());
            }
        }
    }
    public void findByNameAndSurname(String name, String surname) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name)&&employee.getSurname().equals(surname)){
                System.out.println("ID: " + employee.getId() + " Name: " + employee.getName() + " Surname:" + employee.getSurname() + " Age: " + employee.getAge());
            }
        }
    }
}