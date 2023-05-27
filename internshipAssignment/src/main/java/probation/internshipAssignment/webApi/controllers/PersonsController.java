package probation.internshipAssignment.webApi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import probation.internshipAssignment.repository.abstracts.PersonRepository;
import probation.internshipAssignment.service.abstracts.PersonService;
import probation.internshipAssignment.service.requests.CreateAdminRequest;
import probation.internshipAssignment.service.responces.CreateAdminResponse;
import probation.internshipAssignment.service.responces.GetPersonResponce;

@RestController
@RequestMapping ("/api/v1/admin")
public class PersonsController {
	private PersonService personService;
	
	@Autowired 
	public PersonsController(PersonService personService, PersonRepository personRepository) {
		super();
		this.personService = personService;
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<GetPersonResponce> getById(@PathVariable int id) {
	    GetPersonResponce response = personService.getById(id);
	    if (response != null) {
	        return ResponseEntity.ok(response);
	    } else {
	        return ResponseEntity.notFound().build();
	    }
	}

	@DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deletePerson(@PathVariable int id) {
        try {
            personService.deleteById(id);
            return ResponseEntity.ok("Kişi başarıyla silindi.");
        } catch (EmptyResultDataAccessException e) {
            return ResponseEntity.notFound().build();
        }
    }
	
	@PostMapping("/check/{id}")
	public ResponseEntity<CreateAdminResponse> checkAdmin(@RequestParam String name, @PathVariable int id, @RequestBody CreateAdminRequest request){
		
		    CreateAdminResponse createAdminResponse = new CreateAdminResponse();
		    request.setRole("ADMIN");
	        request.setAddress("ANKARA");
	        request.setPhoneNumber("0312 123 45 67");
	        request.setIp("10.12.8.1");
	        

	        createAdminResponse.setRole("ADMIN");
	        createAdminResponse.setAddress("ANKARA");
	        createAdminResponse.setPhoneNumber("0312 123 45 67");
	        createAdminResponse.setIp("10.12.8.1");
	        
		   
		    personService.add(request);
		    

		    return ResponseEntity.ok(createAdminResponse);
		   
}}
		
		

