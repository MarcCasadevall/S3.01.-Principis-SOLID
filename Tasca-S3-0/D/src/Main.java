public class Main {
    static void main(String[] args) {
        PersonRepository repository = new MySql();
        ServicePerson servicePerson = new ServicePerson(repository);

        Person person = new Person();
        person.setName("Elon Musk");

        servicePerson.save(person);
    }
}
