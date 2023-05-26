public class Main {
    public static void main(String[] args) {
        Person person=new Person();
        person.setFirstName("Murad");
        person.setLastName("Muradli");
        person.setAge(27);


        System.out.println(person.getFullName());
        System.out.println(person.isTeen());


    }
}