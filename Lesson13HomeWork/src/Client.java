import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Client {
    private String fullname;
    private LocalDate birthDate; //dd.mm.yyyy
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern(("dd.MM.yyyy"));

    public Client(String fullname, String birthDate) {
        this.fullname = fullname;
        this.birthDate = LocalDate.parse(birthDate, formatter);
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getFullname() {
        return fullname;
    }

    public void setBirthDate(String birthDate) {

        this.birthDate = LocalDate.parse(birthDate, formatter);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client person = (Client) o;
        return
                Objects.equals(fullname, person.fullname) && Objects.equals(birthDate, person.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullname, birthDate);
    }

    @Override
    public String toString() {
        return "Client fullname [" + fullname + ']';
    }

    public int getClientsAge() {
        LocalDate now = LocalDate.now();
        int clientsAge = Period.between(now, this.birthDate).getYears();
        return clientsAge;
    }
}
