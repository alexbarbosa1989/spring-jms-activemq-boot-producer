package com.prueba.jms.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class Sender {

  private static final Logger LOGGER = LoggerFactory.getLogger(Sender.class);

  @Autowired
  private JmsTemplate jmsTemplate;

  public void send(String message) {
    LOGGER.info("Mensaje Enviado='{}'", message);
    System.out.println("Mensaje Enviado "+ message);
    //llamado autowired de jmsTemplate del springframework
    jmsTemplate.convertAndSend("prueba.q",message);
  }
}
