package pendu_tcp;

import org.apache.log4j.PropertyConfigurator;

import pendu_tcp.socket.Server;
import pendu_tcp.util.ConstantUtil;

public class Main {
	
	public static void main(String[] args) {
		
		PropertyConfigurator.configure("resource/log4j.properties");
		
		Thread threadServer = new Thread(new Server(ConstantUtil.PORT));
		threadServer.start();
	}

}
