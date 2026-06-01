package com.course.kafka;

import com.course.kafka.broker.stream.operation.OperationDemoStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaStreamSampleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(KafkaStreamSampleApplication.class, args);
	}

	 @Autowired
	 private OperationDemoStream operationDemoStream;

	@Override
	public void run(String... args) throws Exception {
		operationDemoStream.demoBranch();
	}

}
