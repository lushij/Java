package stop;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import static org.junit.Assert.assertTrue;

import org.junit.*;

public class top1Test {

	@Test
	public void testTop() {
		String ret=new top1().top(50, 26);
		assertThat(ret,startsWith("1"));//答案是120所以会成功
		assertThat(ret,equalTo("120"));
		assertThat(ret,equalTo("12"));
	}

}
