package ptithcm.bean;

//import org.hibernate.validator.constraints.NotBlank;

public class ForgotPassword {
	
//	@NotBlank(message="Email is not empty !")
	private String email;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
