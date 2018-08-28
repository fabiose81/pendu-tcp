package pendu_tcp.util;

import java.net.Socket;

import org.apache.log4j.Logger;

public class LogUtil {

	final static Logger logger = Logger.getLogger(LogUtil.class);

	public static void write(Socket client, String word, String attempt, String result) {
		
		synchronized (logger) {
			logger.debug(CalendarUtil.dateFormatted()
					.concat("\n")
					.concat(client.getLocalAddress().getHostName())
					.concat(", ")
					.concat(String.valueOf(client.getLocalPort())).concat(", ")
					.concat(word)
					.concat(", ")
					.concat(attempt)
					.concat(result));
		}
		
	}

}
