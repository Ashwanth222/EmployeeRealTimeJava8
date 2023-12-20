import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("hyderabad", 506000, "telangana");
        Address address2 = new Address("vijayawada", 506001, "Andhra Pradesh");
        Address address3 = new Address("bangalore", 506002, "karnataka");
        Address address4 = new Address("thiruvananthapuram", 506003, "kerala");
        Address address5 = new Address("chennai", 506004, "tamil nadu");
        Address address6 = new Address("haryana", 506005, "Haryana");

        Employee e1 = new Employee(1,"employee1","electronics",31,address1);
        Employee e2 = new Employee(2,"employee2","electrical",32,address2);
        Employee e3 = new Employee(3,"employee3","mechanical",33,address3);
        Employee e4 = new Employee(4,"employee4","civil",34,address4);
        Employee e5 = new Employee(5,"employee5","software",31,address5);
        Employee e6 = new Employee(6,"employee6","instrumentation",32,address6);

        List<Employee> employeeList = Arrays.asList(e1,e2,e3,e4,e5,e6);
        employeeList.stream()
                .sorted(Comparator.comparing(Employee::getAge)).forEach(System.out::println);
        //System.out.println(sortByAge.);
    }
}