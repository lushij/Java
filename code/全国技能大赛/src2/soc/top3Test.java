package soc;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;


import org.junit.*;

public class top3Test {

	@Test
	public void testTop3() {
//		assertThat(new top3().top3("abc", "123456"),equalTo("用户名不符合要求"));
		assertThat(new top3().top3("abc", "123456"),containsString("用户名不符合要求"));
	}

}
