public class tester {

    public static void main(String[] args){
        Person p1 = new Person("sdjan", "Smith", 15); //eigth A
        Person p2 = new Person("sdjan", "Stewart", 19); //ninth
        Person p3 = new Person("sdjan", "Apple", 15); //first A
        Person p4 = new Person("sdjan", "Applebee", 15); //second A
        Person p5 = new Person("sdjan", "Brent", 19); //fifth
        Person p6 = new Person("sdjan", "Bane", 15); //fourth A
        Person p7 = new Person("sdjan", "Baart", 18); //third
        Person p8 = new Person("sdjan", "Crew", 15); //seventh A
        Person p9 = new Person("sdjan", "Cat", 18); //sixth
        PersonFactory fa = new PersonFactory();
        fa.addPerson(p1);
        fa.addPerson(p2);
        fa.addPerson(p3);
        fa.addPerson(p4);
        fa.addPerson(p5);
        fa.addPerson(p6);
        fa.addPerson(p7);
        fa.addPerson(p8);
        fa.addPerson(p9);
        System.out.println(fa.under18());
        System.out.println(fa.checkLastName("Smith"));
        System.out.println(fa.test());
    }



}
