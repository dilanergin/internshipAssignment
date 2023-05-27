package probation.internshipAssignment.entities.concretes;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table (name="persons")
@Entity

public class Person {
	@Id
	
	@Column (name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="password")
	private String password;
	
	@Column(name="role")
	private String role;
	
	@Column(name="address")
	private String address;
	
	@Column (name="phoneNumber")
	private String phoneNumber;
	
	@Column (name="ipAddress")
	private String ipAddress;
	
	@Column (name="date")
	private LocalDate date;
	
	
}
