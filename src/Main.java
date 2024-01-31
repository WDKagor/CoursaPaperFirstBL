import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Employee employee01 = new Employee("Кравченко", "Анатолий", "Сергеевич", "1", 48500);
        Employee employee02 = new Employee("Давыдов", "Дмитрий", "Дмитриевич", "2", 81000);
        Employee employee03 = new Employee("Березкина", "Светлана", "Алексеевна", "3", 56000);
        Employee employee04 = new Employee("Лязгин", "Сергей", "Сергеевич", "4", 112000);
        Employee employee05 = new Employee("Субботина", "Анна", "Дмитриевна", "5", 71500);
        Employee employee06 = new Employee("Захарова", "Надежда", "Владимировна", "2", 79800);
        Employee employee07 = new Employee("Токарев", "Владимир", "Афонасьевич", "1", 48500);
        Employee employee08 = new Employee("Селезнева", "Тамара", "Генадбевна", "3", 57600);

        Employee[] listOfEmployees = new Employee[10];
        listOfEmployees[0] = employee01;
        listOfEmployees[1] = employee02;
        listOfEmployees[2] = employee03;
        listOfEmployees[3] = employee04;
        listOfEmployees[4] = employee05;
        listOfEmployees[5] = employee06;
        listOfEmployees[6] = employee07;
        listOfEmployees[7] = employee08;

        for (int i = 0; i < listOfEmployees.length; i++) {
            Employee employees = listOfEmployees[i];
            System.out.println(employees);
            }
        }


    }

}