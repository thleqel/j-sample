package au.com.deloitte.to.exercise1.model;

/**
 * @author Thanh Le
 */
public class Applicant {
    private String firstNames;
    private String lastName;
    private int age;
    private Nationality nationality;
    private ResidentStatus residentStatus;
    private String status;

    public String getFirstNames() {
        return firstNames;
    }

    public void setFirstNames(String firstNames) {
        this.firstNames = firstNames;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }

    public ResidentStatus getResidentStatus() {
        return residentStatus;
    }

    public void setResidentStatus(ResidentStatus residentStatus) {
        this.residentStatus = residentStatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
