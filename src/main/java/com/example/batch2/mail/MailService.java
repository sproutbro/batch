package com.example.batch2.mail;

import lombok.AllArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class MailService {

    private JavaMailSender javaMailSender;

    public void send() {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo("d55@naver.com");
        simpleMailMessage.setSubject("djfio");
        simpleMailMessage.setText("fdjiodsf");
        javaMailSender.send(simpleMailMessage);
    }

}
