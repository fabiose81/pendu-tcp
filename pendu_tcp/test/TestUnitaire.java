import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import pendu_tcp.util.FileUtil;
import pendu_tcp.util.WordUtil;

class TestUnitaire {

	@Test
	void wordTest() throws IOException {
		assertNotNull(FileUtil.word());
	}

	@Test
	void encodingTest() {
		assertEquals(WordUtil.encoding("cafe"), "____");
	}
	
	@Test
	void checkTest() {
		assertEquals(WordUtil.check("cafe", "____", 'f'), "__f_");
	}
	
}
