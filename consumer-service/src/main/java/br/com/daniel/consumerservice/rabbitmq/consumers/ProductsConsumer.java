package br.com.daniel.consumerservice.rabbitmq.consumers;

import dtos.ProductDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import static constants.RabbitMQConstants.RK_PRODUCT_LOG;

@Slf4j
@Component
public class ProductsConsumer {

    @RabbitListener(queues = {RK_PRODUCT_LOG})
    public void consumer(ProductDTO productDTO) {
        log.info("Received a message {}", productDTO.toString());
    }

}
