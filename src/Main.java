import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Gulumkan", "Uson kyzy", LocalDate.of(2002, 4, 25));
        Person person1 = new Person("Zarina", "Akmatova", LocalDate.of(2001, 12, 1));

        Group group = new Group("Java-12", LocalDate.of(2023, 10, 4), "Aizat", person);
        Group group1= new Group("Js-12", LocalDate.of(2023, 10, 4), "Datka", person1);

        Company company = new Company("Peaksoft", "Kyrgyzstan", LocalDate.of(2020, 10, 16), "Esen Niiazov", new Group[]{group,group1});
        company.getInfo();
    }
}