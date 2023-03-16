import java.util.ArrayList;
import java.lang.*;
public class PersonFactory {

    private ArrayList<Person> allPersons;

    public PersonFactory() {
        allPersons = new ArrayList<>();
    }


    public void addPerson(Person person) {
        int index = 0;
        for (Person p : allPersons) {
            if (p.getLastName().compareTo(person.getLastName()) > 0) {
                break;
            }
            index++;
        }
        allPersons.add(index, person);
    }

    public ArrayList<Person> under18() {
        ArrayList<Person> minors = new ArrayList();
        for (Person i : allPersons){
            if (i.getAge() < 18){minors.add(i);}
        }
        return minors;
    }

    public boolean checkLastName(String lastName) {
        for (Person i : allPersons){
            if (i.getLastName().equals(lastName)){return true;}
        }
        return false;
    }

    public ArrayList<Person> test(){return allPersons;}
 }
