import java.time.LocalDate;

public class Guest {
    private String name;
    private String surname;
    private LocalDate dob;

    public Guest(String name, String surname, LocalDate dob) {
        this.name = name;
        this.surname = surname;
        this.dob = dob;
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

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getDescription(){
        return this.getName() + " " + this.getSurname() + " (" + this.getDob() + ")";
    }
}
