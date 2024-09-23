package com.genai.constants;

public class Constants {
	
	public static final String SUCCESS_CODE = "200";
	
	public static final String SUCCESS_MSG = "SUCCESS";
	
	public static final String FAILURE_CODE = "400";
	
	public static final String FAILURE_MSG = "FAILURE";
	
	public static final String USER_NOT_FOUND = "USER NOT FOUND";
 	
	public static final String ERROR = "APPLICATION ERROR";
	
	public static final String USER_REGISTRATION_SUCCESS = "USER REGISTERED SUCCESSFULLY";
	
	public static final String USER_REGISTRATION_FAIL = "User Registeration Failed";
	
	public static final String USER_EXISTS = "User Already Registered with this Mail Id";
	
	public static final String USER_NOT_EXISTS = "User Not Yet Registered with the Provided MailId";
	
	public static final String EMAIL_Registration_SUCCESSFUL_SUBJECT = "Custom Gen Ai User Registration Successful ...";
	
	public static final String FORGOT_PASSWORD = "Custom Gen Ai User Forgot Password Request ...";
	
	public static final String CHECK_MAIL = "Password will be notified to Registered Email";
	
	public static final String GET_USER_COUNT = "select count(*) from User where userid=?";
	
	public static final String GET_USER_PASSWORD = "select password from User where userid=?";
	
	public static final String GET_USER_OBJECT = "select * from user where email=? and password=?";

	public static final String INSERT_USER = "insert into user(userid,firstName,lastName,email,password,dateOfJoin)"
			+ "values(?,?,?,?,?,?)";

	public static String getUserRegistrationBody(String firstName, String LastName, String userId, String email, String date) {
	    String PATIENT_REGISTRATION_CONTENT = String.format(
	            "Dear %s,%n%n" +
	            "Congratulations! Your registration with our Custom Gen Ai Portal has been successfully completed. Welcome to our Generative Ai community!%n%n" +
	            "Below are your registration details:%n%n" +
	            "- **UserId:** %s%n" +
	            "- **Email Address:** %s%n" +
	            "- **Registration Date:** %s%n" +
	            "We are dedicated to providing you with comprehensive Ai services and support. If you have any inquiries or require assistance, do not hesitate to contact our support team.%n%n" +
	            "Thank you for choosing our Portal. We are committed to offering you exceptional Ai experiences.%n%n" +
	            "Best regards,%n" +
	            "Generative Ai Team%n" +
	            "Address Line%n" +
	            "Beaumont, Texas, 77705%n" +
	            "Phone: +1 123-456-7890%n" +
	            "Email: info@customGenAi.com",
	            firstName+" "+LastName, userId, email, date
	    );
	    return PATIENT_REGISTRATION_CONTENT;
	}
	
	public static String forgotpassword(String password) {
		return String.format(
				"Dear User,\r\n"
				+ "\r\n"
				+ "We received a request to get the password associated with your account. Please find the details below to securely reset your password:\r\n"
				+ "\r\n"
				+ "Password: %s\r\n"
				+ "\r\n"
				+ "We recommend that you change this password after logging in.\r\n"
				+ "\r\n"
				+ "To change your password:\r\n"
				+ "\r\n"
				+ "Log in to your account using the password.\r\n"
				+ "Navigate to the \"Account Profile Settings\" section.\r\n"
				+ "Update your password and confirm the change.\r\n"
				+ "If you did not request a password reset, please ignore this email or contact our support team.\r\n"
				+ "\r\n"
				+ "Thank you for choosing our service.\r\n"
				+ "\r\n"
				+ "Best regards,\r\n"
				+ "Generative Ai Team\r\n"
				+"Beaumont, Texas, 77705%n"
	            +"Phone: +1 123-456-7890%n"
	            +"Email: info@customGenAi.com",
				password);
	}
}