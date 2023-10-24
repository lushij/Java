package soc;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.*;

public class top2Test {
	top2 top ;
	@Before
	public void before() {
		top=new top2();
	}
	@Test
	public void testTop2() {
		assertThat(top.top2('W', 'e'),equalTo("周三"));
	}

}
