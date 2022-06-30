package org.example;

import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.Channel;

public class Main {
    private static final String message = "Hello World!!";

    public static void main(String[] args) throws Exception {
        ConnectionFactory factory = new ConnectionFactory();

        // localhost: connect to a RabbitMQ node on the local machine
        // Specify the IP/hostname for connecting to a RabbitMQ node on different machine
        factory.setHost("localhost");

        // try-with-resource statement: resources is objects in this statement
        // will automatically close when apllication ends
        try (Connection conn = factory.newConnection();
             Channel channel = conn.createChannel()) {
            // send massage

        }



    }
}