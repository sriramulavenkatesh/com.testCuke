package com.lessons.one;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailUtil {
	
	public static void sendMail(String To) throws FileNotFoundException, IOException {
		
		Properties p = new Properties();
		p.load(new FileInputStream(new File("./config.properties")));
		final String username = p.getProperty("gmail");
        final String password = p.getProperty("password");

        Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); //TLS
        
        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(p.getProperty("gmail")));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(To)
            );
            message.setSubject("Testing Gmail TLS");
            message.setText("Dear Venkatesh,"
                    + "\n\n welcome!");

            Transport.send(message);

            System.out.println("Done");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
		
		
		
	}
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		sendMail("sriram4254@gmail.com");
		
		
	}
	

}
