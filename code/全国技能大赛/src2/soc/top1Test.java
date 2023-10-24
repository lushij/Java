package soc;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.*;

public class top1Test {

	top1 top;
	@Before
	public void before() {
		top = new top1();
	}
	
	@Test
	public void testTop() {
		assertThat(top.top(0, 0),equalTo("输入不符合要求"));
	}

}
