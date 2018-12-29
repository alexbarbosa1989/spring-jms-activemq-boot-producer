package com.prueba.jms;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.prueba.jms.producer.Sender;

@RunWith(SpringRunner.class)
@SpringBootTest
@DirtiesContext
public class SpringJmsApplicationTest {

  @Autowired
  private Sender sender;

  @Test
  public void testSender() throws Exception {
	sender.send("Hello Spring JMS ActiveMQ!");	
  }

}
