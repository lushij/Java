package Class;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
public class TopicTest {
	Topic top;
	@Before
	public void before() {
		top = new Topic();
	}
	
	@Test
	public void test1() {
		assertEquals(3,new Topic().topic1(70,90));
		assertEquals(3,top.topic1(70,90));
	}
	
	@Test
	public void test2() {
		assertEquals("月份输入不正确", top.topic2(2023, 0));
		assertEquals("2023年2月份的天数是28天", top.topic2(2023, 2));	
		assertEquals("2022年10月份的天数是31天", top.topic2(2022, 10));
	}
	@SuppressWarnings("deprecation")
	@Test
	public void AssertThat() {
		assertThat(top.topic2(2022, 10), equals("2022年10月份的天数是31天"));
	}
}
