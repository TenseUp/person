public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public Person(String f, String l, int a){
        this.firstName = f;
        this.lastName = l;
        this.age = a;
    }

    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public int getAge(){return age;}

    public void setFirstName(String s){firstName = s;}
    public void setLastName(String s){lastName = s;}
    public void setAge(int a){age = a;}

    public String toString(){return firstName + " " + lastName + " " + age;}

}
