package Chapter_2.Bai_5;
public class Notification_ {
    private MessageService messageService;

    public void setMessageService(MessageService messageService){
        this.messageService = messageService;
    }

    public void notifyUser(String message) {
        if (messageService != null) {
            messageService.sendMessage(message);
        }
    }
}
