package com.github.paicoding.forum.core.rabbitmq;

import com.rabbitmq.client.BuiltinExchangeType;
import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * 说明：添加rabbitmq连接池后，这个就可以废弃掉
 * @author Louzai
 * @date 2023/5/10
 */
@Component
public class RabbitmqUtil {

    @Autowired
    private AmqpAdmin amqpAdmin;

    public void declareExchange(String exchange, BuiltinExchangeType exchangeType) {
        Exchange durableExchange;
        switch (exchangeType) {
            case DIRECT:
                durableExchange = new DirectExchange(exchange);
                break;
            case TOPIC:
                durableExchange = new TopicExchange(exchange);
                break;
            case FANOUT:
                durableExchange = new FanoutExchange(exchange);
                break;
            case HEADERS:
                durableExchange = new HeadersExchange(exchange);
                break;
            default:
                throw new IllegalArgumentException("Unsupported exchange type: " + exchangeType);
        }
        amqpAdmin.declareExchange(durableExchange);
    }
}
