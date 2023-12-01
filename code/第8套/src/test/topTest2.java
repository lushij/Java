package test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

public class topTest2 {

	@Test
	public void test() {
		assertThat(new top().top2(30, 40),equalTo("a=x:60"));
		assertThat(new top().top2(30, 40),equalTo("a=x:3"));
	}

}
