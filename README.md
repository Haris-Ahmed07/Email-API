# Email API using JavaMail and Spring Framework

## Introduction

This Email API is a straightforward Java application developed using the Spring Framework and JavaMail API. Its primary purpose is to enable the programmatic sending of emails through a Gmail SMTP server. By leveraging this API, you can seamlessly integrate email sending functionality into your Java applications.

## Prerequisites

Before you can utilize this Email API, please ensure that you have the following prerequisites in place:

1. **Java Development Kit (JDK)**: Make sure you have the JDK installed on your local machine.

2. **Gmail Account**: You will need a Gmail account that will serve as the sender of your emails.

## Setup

Follow these steps to set up and configure the Email API:

1. Clone or download the repository to your local machine.

2. Open the project using your preferred Java development environment (such as Eclipse or IntelliJ IDEA).

3. Update the following information in the `EmailService` class:

    - Replace `"from@gmail.com"` with the Gmail email address you intend to use as the sender.
    
    - Replace `"pass"` with the password corresponding to the Gmail account.
    
4. Ensure that your Gmail account settings permit access to "Less Secure Apps." If you have enabled two-step verification, generate an "App Password" for the application.

## Usage

To utilize the Email API in your application, follow these steps:

1. Import the `EmailService` class from the `com.emailapi.services` package into your application code.

2. Create an instance of the `EmailService` class.

3. Call the `sendEmail` method, providing the recipient's email address, subject, and message body as arguments.

Here's an example of how to use the Email API in your application:

```java
import com.emailapi.services.EmailService;

public class MyApplication {
    public static void main(String[] args) {
        EmailService emailService = new EmailService();
        
        String to = "recipient@example.com";
        String from = "from@gmail.com";
        String subject = "Hello from Email API";
        String message = "This is a test email sent using the Email API.";
        
        emailService.sendEmail(to, from, subject, message);
    }
}
```

## Troubleshooting

If you encounter any issues while using this Email API, consider the following troubleshooting steps:

- Double-check the sender's email address and password in the `EmailService` class.
  
- Ensure that your Gmail account settings allow access to "Less Secure Apps" or generate an "App Password" if two-step verification is enabled.
  
- Verify your internet connection and firewall settings to ensure that the application can communicate with the Gmail SMTP server.

## Notes

- This API relies on the JavaMail API and Spring Framework to simplify the process of sending emails using a Gmail SMTP server.

- Please note that the provided code serves as a basic implementation and may require further customization based on your specific requirements.

- When storing passwords in code, exercise caution. Consider using environment variables or secure configuration mechanisms for production applications.

## License

This Email API is made available under the MIT License, granting you the freedom to use and modify it according to your needs.
