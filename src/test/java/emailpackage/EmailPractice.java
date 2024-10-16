package emailpackage;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class EmailPractice {

	public static void main(String[] args) throws EmailException {

		System.out.println("Email initiated");
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("Email Address", "Password"));
		email.setSSLOnConnect(true);
		email.setFrom("gopi@gmail.com");
		email.setSubject("TestMail");
		email.setMsg("This is a test mail ... :-)");
		email.addTo("Receiver Email Address");
		email.send();
		System.out.println("Email send succesfully..");

	}

}
