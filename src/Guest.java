import java.time.LocalDate;

public class Guest {
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private String otherInfo;

    public Guest(String name, String surname, LocalDate dateOfBirth) {
        this(name, surname, dateOfBirth, "No other info");
    }

    public Guest(String name, String surname, LocalDate dateOfBirth, String otherInfo) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.otherInfo = otherInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDescription(){
        return this.getName() + " " + this.getSurname() + " (" + this.getDateOfBirth() + ")" + ", " + this.otherInfo;
    }
}
