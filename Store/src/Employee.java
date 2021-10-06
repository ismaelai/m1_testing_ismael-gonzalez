import java.util.List;

public class Employee {

    // Declaration attributes
    public String name;
    public String lastName;
    public String nationalId;
    public Integer age;
    public Double yearsExperience;
    public Boolean civilStatus;
    public List<String> phoneNumbers;


    // Create constructor methods
    public Employee() {}

    public Employee(String name, String lastName, String nationalId, Integer age, Double yearsExperience, Boolean civilStatus, List<String> phoneNumbers) {
        this.name = name;
        this.lastName = lastName;
        this.nationalId = nationalId;
        this.age = age;
        this.yearsExperience = yearsExperience;
        this.civilStatus = civilStatus;
        this.phoneNumbers = phoneNumbers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getYearsExperience() {
        return yearsExperience;
    }

    public void setYearsExperience(Double yearsExperience) {
        this.yearsExperience = yearsExperience;
    }

    public Boolean getCivilStatus() {
        return civilStatus;
    }

    public void setCivilStatus(Boolean civilStatus) {
        this.civilStatus = civilStatus;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nationalId='" + nationalId + '\'' +
                ", age=" + age +
                ", yearsExperience=" + yearsExperience +
                ", civilStatus=" + civilStatus +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }

    public void add(Employee employee) {
    }
}
