package probation.internshipAssignment.service.responces;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateAdminResponse {
	
		private String role;
		private String address;
		private String phoneNumber;
		private String ip;

}
