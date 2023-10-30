package sr;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;


import org.junit.*;

public class tp1Test {

	@Test
	public void testRunnian() {
		assertThat(new tp1().runnian(2021, 1),equalTo("2021年的1月份的天数为：31天"));
	}

}
