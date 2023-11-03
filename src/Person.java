import java.time.LocalDate;

import static java.lang.StringTemplate.STR;

public class Person {
    String firstName;
    String lastName;
    LocalDate dateOfBirth;

    public Person(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }
    public String getInfo(){
        return STR."""
                Person name : \{firstName}
                Person surname: \{lastName}
                Person date of birth: \{dateOfBirth}

                """;
    }
}
