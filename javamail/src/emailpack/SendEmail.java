package emailpack;

//import only necessary classes or static class members to increase performance
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail {
	
public static void main(String [] args){  
String to = "saiguruyerraganti@gmail.com";//change accordingly  
String from = "bondtoday@gmail.com";//change accordingly  
String host = "gmail.com";//or IP address  

//Get the session object  
Properties properties = System.getProperties();  
properties.setProperty("smtp.host", host);  
Session session = Session.getDefaultInstance(properties);  

//compose the message  
try{  
MimeMessage message = new MimeMessage(session);  
message.setFrom(new InternetAddress(from));  
message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
message.setSubject("Ping");  
message.setText("Hello, this is example of sending email  ");  

// Send message  
Transport.send(message);  
System.out.println("message sent successfully....");  

}catch (MessagingException mex) {mex.printStackTrace();}  
}
}

