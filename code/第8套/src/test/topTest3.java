package test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;


import org.junit.Test;

public class topTest3 {

	@Test
	public void test() {
		assertThat(new top().top3("lu", "1239862322", "henanzz"),equalTo("OK"));
	}

}
