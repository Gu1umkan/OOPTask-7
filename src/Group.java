import java.time.LocalDate;

public class Group {
    String groupName;
    LocalDate startDate;
    String mentor;
    Person person;

    public Group(String groupName, LocalDate startDate, String mentor, Person person) {
        this.groupName = groupName;
        this.startDate = startDate;
        this.mentor = mentor;
        this.person = person;
    }
    public  String getInfo(){
        return STR."""
                Group name: \{groupName}
                Start date: \{startDate}
                Mentor :\{mentor}

                Person: \{person.getInfo()}
                """;
    }

}
