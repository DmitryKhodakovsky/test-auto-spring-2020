package lesson04.dp.builder;

public class CreatePersonService {

    public static int createPerson(PersonWOBuilder personWOBuilder) {
        System.out.println("Person created: ");
        System.out.println(personWOBuilder);
        return 201;
    }

    public static int createPerson(Person person) {
        System.out.println("Person created: ");
        System.out.println(person);
        return 201;
    }
}
