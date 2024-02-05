import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Employee[] listOfEmployees = new Employee[10];
        {
            listOfEmployees[0] = new Employee("Кравченко", "Анатолий", "Сергеевич", "1", 48500);
            listOfEmployees[1] = new Employee("Давыдов", "Дмитрий", "Дмитриевич", "2", 81000);
            listOfEmployees[2] = new Employee("Березкина", "Светлана", "Алексеевна", "3", 56000);
            listOfEmployees[3] = new Employee("Лязгин", "Сергей", "Сергеевич", "4", 112000);
            listOfEmployees[4] = new Employee("Субботина", "Анна", "Дмитриевна", "5", 71500);
            listOfEmployees[5] = new Employee("Захарова", "Надежда", "Владимировна", "2", 79800);
            listOfEmployees[6] = new Employee("Токарев", "Владимир", "Афонасьевич", "1", 48500);
            listOfEmployees[7] = new Employee("Селезнева", "Тамара", "Генадбевна", "3", 57600);
            listOfEmployees[8] = new Employee("Гегельман", "Захар", "Юсупович", "4", 126600);
            listOfEmployees[9] = new Employee("Потапова", "Татьяна", "Андреевна", "1", 48500);
        }
        printAllEmployee(listOfEmployees);
        int resultSalary = culculateSalary(listOfEmployees);
        System.out.println("Фонд заработной платы: " + resultSalary + " руб.");
        int minSalary = minSalary(listOfEmployees);
        System.out.println("Минимальная заработная плата: " + minSalary + " руб.");
        int maxSalary = maxSalary(listOfEmployees);
        System.out.println("Максимальная заработная плата: " + maxSalary + " руб.");
        int avarageSalary = avarageSalary(listOfEmployees);
        System.out.println("Средняя заработная плата: " + avarageSalary + " руб.");
    }

    private static void printAllEmployee(Employee[] listOfEmployees) {
        for (int i = 0; i < listOfEmployees.length; i++) {
            Employee employees = listOfEmployees[i];
            System.out.println(employees);
        }
    }

    private static int culculateSalary(Employee[] listOfEmployees) {
        int resultSalary = 0;
        for (int i = 0; i < listOfEmployees.length; i++) {
            Employee employee = listOfEmployees[i];
            resultSalary = resultSalary + employee.getSalary();
                    }
        return resultSalary;
    }

    private static int minSalary(Employee[] listOfEmployees) {
        int minSalary = listOfEmployees[0].getSalary();
        for (int i = 0; i < listOfEmployees.length; i++) {
            if (minSalary > listOfEmployees[i].getSalary())
                minSalary = listOfEmployees[i].getSalary();
        }
        return minSalary;
    }
    private static int maxSalary(Employee[] listOfEmployees) {
        int maxSalary = listOfEmployees[0].getSalary();
        for (int i = 0; i < listOfEmployees.length; i++) {
            if (maxSalary < listOfEmployees[i].getSalary())
                maxSalary = listOfEmployees[i].getSalary();
        }
        return maxSalary;
    }

    private static int avarageSalary(Employee[] listOfEmployees) {
        int avarageSalary = culculateSalary(listOfEmployees)/listOfEmployees.length;
        return avarageSalary;
    }



}