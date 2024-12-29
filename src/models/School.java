package models;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class School {
    private List<Person> members;
    public School() {
        members = new ArrayList<>();
    }
    public void AddMember(Person person) {
        members.add(person);
    }
    @Override
    public String toString() {
        members.sort(Comparator.comparing(Person::getSurname));
        StringBuilder result = new StringBuilder("School members:\n");
        for (Person member : members) {
            result.append(member.toString()).append("\n");
        }
        return result.toString();
    }
}
