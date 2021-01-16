package mn.foreman.telegrambot;

import mn.foreman.telegrambot.db.session.SessionRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

/** The Foreman Telegram bot. */
@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = SessionRepository.class)
@EnableScheduling
public class TelegramBotApplication {

    /**
     * Application entry point.
     *
     * @param args The command line arguments.
     */
    public static void main(final String[] args) {
        SpringApplication.run(
                TelegramBotApplication.class,
                args);
    }
}