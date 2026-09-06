# Video Streaming Microservices Application

![Build Status](https://img.shields.io/badge/build-passing-brightgreen) ![License](https://img.shields.io/badge/license-MIT-blue) ![Java](https://img.shields.io/badge/Java-21-orange)

## Overview
This project demonstrates a full-fledged video streaming application built using **Spring Boot 3** microservice architecture, incorporating industry-standard components for service discovery, routing, and centralized configuration.

## Image Preview
![Project Dashboard](/images/file.png)

## Features
* **Service Registry:** Uses *Eureka Server* to manage and discover active microservices dynamically.
* **API Gateway:** Centralized routing through *Spring Cloud Gateway* to abstract internal service complexities.
* **Centralized Configuration:** Managed via *Spring Cloud Config Server* with support for native profile-based setups.
* **Distributed Tracing:** Integrated with *Zipkin* for real-time observability and performance tracking.
* **Inter-Service Communication:** Implemented using *Load Balancer* for resilient interaction between the catalog and streaming services.

## Installation
1. **Prerequisites:** Ensure you have *Java 21* (LTS) and *Gradle* installed.
2. **Clone the repository:** `git clone [repository-url]`
3. **Build the projects:** Navigate to the root directory and run `./gradlew build`.
4. **Database Setup:** Configure your local *MySQL* instance and update the connection properties in your configuration files.

## Usage
To run the application, start the microservices in the following order:
1. **Service Registry** (Eureka Server)
2. **Config Server**
3. **Movie Catalog Service**
4. **Movie Streaming Service**
5. **API Gateway**

Access the web application by opening `web_app.html` in your browser.

## Contributing
We welcome contributions! Please refer to our [CONTRIBUTING.md](CONTRIBUTING.md) for guidelines on how to submit pull requests.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more information.
