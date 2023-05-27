package probation.internshipAssignment.service.responces;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetPersonResponce {
	private int id;
	private String name;
	private String password;
	
}