package br.com.daniel.consumerservice.rabbitmq.consumers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import static constants.RabbitMQConstants.RK_PRODUCT_LOG;


@Slf4j
@Component
public class StringConsumer {

//    @RabbitListener(queues = {RK_PRODUCT_LOG})
    public void consumer(String message) {
        log.info("Consumer received a message {}", message);
    }

}
