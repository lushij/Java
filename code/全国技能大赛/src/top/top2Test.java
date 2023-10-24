package top;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.*;

public class top2Test {
	top2 top ;
	@Before 
	public void before(){
		top = new top2();
	}
	@Test
	public void testTop2() {
		assertThat(top.top2(2023,2),equalTo("2023年2月份的天数是28天"));
	}
	@Test
	public void testTop3() {
		assertThat(top.top2(2000,2),equalTo("2023年2月份的天数是28天"));
	}
	@Test
	public void testTop4() {
		assertThat(top.top3(2000),equalTo(true));
	}
}
