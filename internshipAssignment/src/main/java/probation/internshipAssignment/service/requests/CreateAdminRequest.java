package probation.internshipAssignment.service.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateAdminRequest {
private int id;
private String name;
	private String role;
	private String address;
	private String phoneNumber;
	private String ip;

}
