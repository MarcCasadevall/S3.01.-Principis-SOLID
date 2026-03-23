public class ServicePerson {
    private final PersonRepository personRepository;

    public ServicePerson(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
    public void save(Person person) {
        personRepository.savePerson(person);
    }
}