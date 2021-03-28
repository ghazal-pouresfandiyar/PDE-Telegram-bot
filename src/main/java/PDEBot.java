import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class PDEBot extends TelegramLongPollingBot {
    public String getBotUsername() {
        return "pde_hw_bot";
    }

    public String getBotToken() {
        return "1615476472:AAH8l3_0p3cJfZ8FXQ8e-rVd5h6NkgMbuwE";
    }

    public void onUpdateReceived(Update update) {
        System.out.println(update.getMessage().getText());
    }
}
