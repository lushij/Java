package test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.*;

public class topTest {

	@Test
	public void test() {
		assertThat(new top().top1(50, 60),startsWith("1"));
	}

}
