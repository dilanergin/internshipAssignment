package probation.internshipAssignment.service.abstracts;

import probation.internshipAssignment.service.requests.CreateAdminRequest;
import probation.internshipAssignment.service.responces.GetPersonResponce;

public interface PersonService {

GetPersonResponce getById(int id);

void deleteById(int id);

void add(CreateAdminRequest createAdminRequest) ;


}
