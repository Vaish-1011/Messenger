public class Main {
    public static void main(String[] args) {
        MessagingService sms = new SMSMessagingService();
        MessagingService email = new EmailMessagingService();
        MessagingService whatsapp = new WhatsAppMessagingService();

        sms.sendMessage();
        email.sendMessage();
        whatsapp.sendMessage();
    }
}

interface MessagingService {
    void sendMessage();
}

class SMSMessagingService implements MessagingService {
    @Override
    public void sendMessage() {
        System.out.println("Sending SMS message");
    }
}

class EmailMessagingService implements MessagingService {
    @Override
    public void sendMessage() {
        System.out.println("Sending email message");
    }
}

class WhatsAppMessagingService implements MessagingService {
    @Override
    public void sendMessage() {
        System.out.println("Sending WhatsApp message");
    }
}