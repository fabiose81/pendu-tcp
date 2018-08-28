package pendu_tcp.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import pendu_tcp.util.ConstantUtil;
import pendu_tcp.util.FileUtil;
import pendu_tcp.util.LogUtil;
import pendu_tcp.util.WordUtil;

public class PoolClient implements Runnable {

	private Socket client;

	public PoolClient(Socket client) {
		this.client = client;
	}

	@Override
	public void run() {

		PrintWriter out = null;
		BufferedReader in = null;

		try {
			out = new PrintWriter(client.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(client.getInputStream()));

			String word = FileUtil.word();
			String wordEncoded = WordUtil.encoding(word);

			String wordEncodedTemp = "";
			String clientResponse = "";
			String result = "";
			StringBuilder attemptHistory = new StringBuilder("");
			boolean loop = true;
			int error = 0;

			System.out.println(word);

			out.println(wordEncoded);

			while (loop) {
				if (in != null) {
					clientResponse = in.readLine();
					
					wordEncodedTemp = wordEncoded;
					wordEncoded = WordUtil.check(word, wordEncoded, clientResponse.toUpperCase().charAt(0));

					attemptHistory.append(clientResponse.toUpperCase().charAt(0));
					attemptHistory.append(", ");

					out.println(wordEncoded);

					if (wordEncodedTemp.equalsIgnoreCase(wordEncoded)) {
						error++;
					}

					if (!wordEncoded.contains("_")) {
						loop = false;
						result = ConstantUtil.VICTORY;
						out.println(ConstantUtil.MSG_WIN);
					} else {
						if (error == 5) {
							loop = false;
							result = ConstantUtil.FAILURE;
							out.println(ConstantUtil.MSG_LOSE);
						}
					}
				}

				
			}
			
			LogUtil.write(client, word, attemptHistory.toString(), result);

			client.close();
			out = null;
			in = null;

		} catch (IOException iOException) {
			iOException.printStackTrace();
		} finally {
			try {
				client.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			out = null;
			in = null;
		}

	}

}
