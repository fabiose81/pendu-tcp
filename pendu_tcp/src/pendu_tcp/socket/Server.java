package pendu_tcp.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import pendu_tcp.controller.PoolClient;
import pendu_tcp.util.ConstantUtil;


public class Server  implements Runnable{
	
	private int port;
	
	public Server(int port) {
		this.port = port;
	}

	@Override
	public void run() {
		
		try {
			ServerSocket server = new ServerSocket(port);
			
			System.out.println(ConstantUtil.SERVER_ON.concat(": ").concat(String.valueOf(port)));
			
			while (true) {
				Socket client = server.accept();
				
				PoolClient poolClient = new PoolClient(client);
				Thread threadClient = new Thread(poolClient);
				threadClient.start();
				
			}
			
		} catch (IOException iOException) {
			iOException.printStackTrace();
		}
		
	}

}
