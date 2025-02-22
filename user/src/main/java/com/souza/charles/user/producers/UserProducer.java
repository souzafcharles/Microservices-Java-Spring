package com.souza.charles.user.producers;
 /*
  Tutorial: Microservices in Practice with Java Spring
  Instructor: Michelli Brito - Decoder.
  Project adapted by: Charles Fernandes de Souza
  Date: February 21, 2025
 */

import com.souza.charles.user.dtos.EmailDTO;
import com.souza.charles.user.model.UserModel;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserProducer {

    final RabbitTemplate rabbitTemplate;

    public UserProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Value(value = "${broker.queue.email.name}")
    private String routingKey;

    public void publishMessageEmail(UserModel userModel) {
        var emailDTO = new EmailDTO();
        emailDTO.setUserId(userModel.getUserId());
        emailDTO.setEmailTo(userModel.getEmail());
        emailDTO.setSubject("Registration successfully completed!");
        emailDTO.setText(userModel.getName() + ", welcome! \nThank you for registering, now enjoy all the features of our platform!");

        rabbitTemplate.convertAndSend("", routingKey, emailDTO);
    }

}