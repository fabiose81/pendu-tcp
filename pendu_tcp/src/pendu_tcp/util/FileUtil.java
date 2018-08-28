package pendu_tcp.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.util.stream.Stream;

public class FileUtil {

	public static String word() throws IOException {

		File file = new File("resource/francais.txt");
		Path path = Paths.get(file.getAbsolutePath());
		long lineCount = Files.lines(path).count();

		Random r = new Random();

		Stream<String> lines = Files.lines(path);
		String word = lines.skip(r.nextInt((int) lineCount)).findFirst().get();

		lines.close();

		return word;
	}

	
}
