---

# Kafka Restful API

This project demonstrates a simple Restful API for publishing messages to a Kafka topic and a consumer for reading those messages.

## Features

- Publish messages to a Kafka topic through a Restful API.
- The consumer (listener) reads and processes events from the Kafka topic.
- A Spring Boot application with Kafka integration.

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java Development Kit (JDK) installed.
- Apache Kafka setup and running.
- Docker setup and running
- A basic understanding of Docker.
- A basic understanding of Spring Boot and Kafka.

## Getting Started

### Running the Application

1. Clone the repository:

   ```bash
   git clone https://github.com/edugaRP/Kafka-Spring-Boot-Studies.git
   ```

2. Build the project


3.Run Docker-Compose: 
  
   ```bash
   docker compose -f kafka-docker-compose.yml up -d
   ```

4. Run the application:

   ```bash
   java -jar target/kafka-application.jar
   ```

The application should now be up and running.

## API Endpoints

### Publish a Message

- **URL:** `POST /messages`
- **Description:** Publish a message to the Kafka topic.
- **Request Body:**

  ```json
  {
    "message": "Your message goes here"
  }
  ```

### Sample Producer

You can also use the command-line runner in the `KafkaApplication` class to publish messages. It publishes a number of messages with the "Hello World" prefix.

---
