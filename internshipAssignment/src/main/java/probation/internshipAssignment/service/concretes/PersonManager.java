package probation.internshipAssignment.service.concretes;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import probation.internshipAssignment.entities.concretes.Person;
import probation.internshipAssignment.repository.abstracts.PersonRepository;
import probation.internshipAssignment.service.abstracts.PersonService;
import probation.internshipAssignment.service.requests.CreateAdminRequest;
import probation.internshipAssignment.service.responces.GetPersonResponce;


@Service
@Transactional
public class PersonManager implements PersonService{
	
	private PersonRepository personRepository;

	@Autowired 
	public PersonManager(PersonRepository personRepository) {
		super();
		this.personRepository = personRepository;
	}
	//iş kuralları buraya gelecek(logic)

	@Override
	public GetPersonResponce getById(int id) {
	    List<Person> persons = personRepository.findAll();
	    for (Person person : persons) {
	        if (person.getId() == id) {
	            GetPersonResponce response = new GetPersonResponce();
	            response.setId(person.getId());
	           response.setName(person.getName());
	            response.setPassword(person.getPassword());
	          
	            return response;
	        }
	    }
	    return null;
	    
	}
	
	@Override
	public void deleteById(int id) {
        personRepository.deleteById(id);
    }


	@Override
	public void add(CreateAdminRequest createAdminRequest)  {
		Person admin = new Person();
	    admin.setId(createAdminRequest.getId());
	    admin.setName(createAdminRequest.getName());
	    admin.setRole(createAdminRequest.getRole());
	    admin.setAddress(createAdminRequest.getAddress());
	    admin.setPhoneNumber(createAdminRequest.getPhoneNumber());
	    admin.setIpAddress(createAdminRequest.getIp());
	    admin.setDate(LocalDate.now());
	    // Veritabanına kaydetme işlemi
	    personRepository.save(admin);				
				
	}

	
}
	







