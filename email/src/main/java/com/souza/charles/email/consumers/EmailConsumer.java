package com.souza.charles.email.consumers;
 /*
  Tutorial: Microservices in Practice with Java Spring
  Instructor: Michelli Brito - Decoder.
  Project adapted by: Charles Fernandes de Souza
  Date: February 21, 2025
 */

import com.souza.charles.email.dtos.EmailRecordDTO;
import com.souza.charles.email.model.EmailModel;
import com.souza.charles.email.services.EmailService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.BeanUtils;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EmailConsumer {

    final EmailService emailService;

    public EmailConsumer(EmailService emailService) {
        this.emailService = emailService;
    }

    @RabbitListener(queues = "${broker.queue.email.name}" )
    public void listenEmailQueue(@Payload EmailRecordDTO emailRecordDto) {
        var emailModel = new EmailModel();
        BeanUtils.copyProperties(emailRecordDto, emailModel);
        emailService.sendEmail(emailModel);
    }
}