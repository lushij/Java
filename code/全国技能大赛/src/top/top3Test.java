package top;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.*;

public class top3Test {
	
	top3 top ;
	@Before 
	public void before() {
		top = new top3();
	}
	@Test
	public void test() {
		assertThat(top.top3("abcde@163.com", "123456"),equalTo("信息正确"));
	}

}
