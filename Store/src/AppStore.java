import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



public class AppStore {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();


        while(true) {
            System.out.println("Choose an option from menu");
            System.out.println("1- View all employees in the store");
            System.out.println("2- View one employee.Introduce ID");
            System.out.println("3- Create a new employee");
            System.out.println("4- Modify a employee.Introduce ID");
            System.out.println("5- Delete a employee.Introduce ID");
            System.out.println("6- Delete all employees");
            System.out.println("7- Exit");

            int choice = scanner.nextInt();

            if (choice==1) {
                System.out.println("You've choosen option 1");

                if (employees.isEmpty()) {
                    System.out.println("Sorry, no available employees");
                } else {
                    System.out.println(employees);
                    System.out.println("We got " + employees.size() + "results");
                }
            } else if (choice==2){
                System.out.println("You've choosen option 2");
                System.out.println("Introduce ID to search specific employee");

                String nationalId = scanner.next();

                boolean idExists = false;
                for (Employee employee : employees){
                    if (employee.nationalId.equals(nationalId)){
                        idExists = true;
                        System.out.println(employee);
                        break;
                    }
                }

                if (!idExists){
                    System.out.println(nationalId + ": Sorry,this employee cannot be found");
                }
            }else if (choice==3){
                System.out.println("You've choosen option 3. Let's create new employee");

                System.out.println("Introduce ID");
                String nationalId = scanner.next();

                // check out if the worker with this ID has been already created before.
                boolean idExists = false;
                for (Employee employee : employees){
                    if (employee.nationalId.equals(nationalId)){
                        idExists = true;
                        break;
                    }
                }
                // if id is busy we won't continue creating employee
                // if it's true then we pass on the next loop iteration
                if (idExists){
                    System.out.println("ID is already occupied, please introduce another!");
                    continue;
                }

                System.out.println("Introduce name");
                String name = scanner.next();
                System.out.println("Introduce last name");
                String lastName = scanner.next();
                System.out.println("Introduce age");
                int age = scanner.nextInt();
                System.out.println("Introduce years of experience");
                Double yearsOfExperience = scanner.nextDouble();;
                System.out.println("Introduce civil status. Is it married?");
                Boolean civilStatus = scanner.nextBoolean();
                System.out.println("Introduce phone number");
                String phoneNumber = scanner.next();
                List<String> phoneNumbers = new ArrayList<>();
                phoneNumbers.add(phoneNumber);


                Employee employee = new Employee(name, lastName, nationalId, age, yearsOfExperience,
                        civilStatus,phoneNumbers);
                employee.add(employee);
                System.out.println(employee);



            } else if (choice==4){
                System.out.println("You've choosen option 4. Modify employee by ID");
                System.out.println("Introduce ID of the employee");
                String nationalId = scanner.next();

                boolean idExists = false;
                for (Employee employee : employees){
                    if (employee.nationalId.equals(nationalId)){
                        // add new data and modify its attributes
                        System.out.println("Introduce years of experience. Current is " + employee.yearsExperience);
                        employee.yearsExperience = scanner.nextDouble();;
                        System.out.println("Introduce civil status. Current is " + employee.civilStatus);
                        employee.civilStatus = scanner.nextBoolean();

                        idExists = true;
                        System.out.println("Employee successfully modified");
                        break;

                    }
                }
                if (!idExists)
                    System.out.println("Cannot be found ID :" + nationalId );

                }else if (choice==5){
                System.out.println("You've choosen option 5- Delete employee by ID'");
                System.out.println("Introduce ID");
                String nationalId = scanner.next();

                boolean idExists = false;
                // loop around the employee arraylist to search by national id
                // if found it, it'll be removed
                Iterator<Employee> iter = employees.iterator();
                while (iter.hasNext()) {
                    Employee employee= iter.next();
                    if (employee.nationalId.equals(nationalId)){
                        iter.remove();
                        idExists = true;
                        System.out.println("Employe deleted succesfully");
                        break;
                    }
                }
                if (!idExists){
                    System.out.println("Cannot be found: " + nationalId);
                }


            } else if (choice==6){
                System.out.println("You've choosen option 6. Delete all employees'");
                employees.clear();
            } else if (choice==7){
                System.out.println("You've choosen option 7- Exit'");

                break;

            } else {
                System.out.println("Selected option was invalid");

            }
            System.out.println("\n");

        }
        System.out.println("See you soon! (L)");

        }
    }

