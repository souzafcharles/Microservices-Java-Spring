package com.souza.charles.email.dtos;
 /*
  Tutorial: Microservices in Practice with Java Spring
  Instructor: Michelli Brito - Decoder.
  Project adapted by: Charles Fernandes de Souza
  Date: February 21, 2025
 */

import java.util.UUID;

public record EmailRecordDTO(UUID userId,
                             String emailTo,
                             String subject,
                             String text) {
}
