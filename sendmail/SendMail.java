package tnpapp.sendmail;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

class MyAuthenticator extends Authenticator{
    private String username,password;
    public MyAuthenticator(String username,String password){
        this.username=username;
        this.password=password;
    }

    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
        PasswordAuthentication pwdAuth=new PasswordAuthentication(this.username,this.password);        
        return pwdAuth;
    }
}

public class SendMail {
    public static void sendMail(String recipientMail, String mailSubject, String mailBody) throws MessagingException {
        final String username = "1972adarshjha@gmail.com";
        final String password = "kzywfrkyiuxpwnkw";
        // Step 1
        Properties prop = new Properties();
	prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "465");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.socketFactory.port", "465");
        prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        
        MyAuthenticator myAuth=new MyAuthenticator(username,password);        
        Session session = Session.getInstance(prop,myAuth);                
        Message message = new MimeMessage(session);
        InternetAddress[]recipients=InternetAddress.parse(recipientMail);
        message.setRecipients(Message.RecipientType.TO, recipients);
        message.setSubject(mailSubject);
        message.setText(mailBody);

        Transport.send(message);

        System.out.println("Mail Sent Successfully!");
    }

}
//    public static void main(String[] args) {
//        final String username = "1972adarshjha@gmail.com";
//        final String password = "kzywfrkyiuxpwnkw";
//        // Step 1
//        Properties prop = new Properties();
//	prop.put("mail.smtp.host", "smtp.gmail.com");
//        prop.put("mail.smtp.port", "465");
//        prop.put("mail.smtp.auth", "true");
//        prop.put("mail.smtp.socketFactory.port", "465");
//        prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
//        
//        MyAuthenticator myAuth=new MyAuthenticator(username,password);        
//        Session session = Session.getInstance(prop,myAuth);                
//        try {
//
//            Message message = new MimeMessage(session);
//            InternetAddress[]recipients=InternetAddress.parse("2619aashu@gmail.com");
//            message.setRecipients(Message.RecipientType.TO, recipients);
//            message.setSubject("Email Testing");
//            message.setText("TNP Cell is inviting you ");
//
//            Transport.send(message);
//
//            System.out.println("Mail Sent Successfully!");
//
//        } catch (MessagingException e) {
//            e.printStackTrace();
//        }
//    }    }
