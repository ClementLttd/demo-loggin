package dev.console;

import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.Logger;
import dev.service.AppService;

public class App {

	private static final Logger LOG = (Logger) LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {

		LOG.info("Bonjour Slf4J !");
		LOG.info("Implementation Logback");

		AppService app = new AppService();

		app.executer("Bonjour");

	}
}
