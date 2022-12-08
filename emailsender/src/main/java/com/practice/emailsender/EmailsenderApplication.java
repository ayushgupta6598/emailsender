package com.practice.emailsender;

import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class EmailsenderApplication {


	@Autowired
	private EmailSenderService emailSenderService;

	public static void main(String[] args) {
		SpringApplication.run(EmailsenderApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void sendEmail() throws MessagingException {
		emailSenderService.sendEmailWithAttachments("himanshu.jain@pristyncare.com","/home/pristyncare/Downloads/3981683.jpeg",
				"Hello, this is a Email","Subject");

	}

}
