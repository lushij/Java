package test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Test;

import Main.topic;

public class topic2Test {
	topic top;
	@Before
	public void before() {
		top=new topic();
	}
	@Test
	public void testTopic2() {
		assertThat(top.topic2(2023, 2),equalTo("2023年2月份的天数是28天"));//正确实例
		assertThat(top.topic2(2022,2),equalTo("2022年2月份的天数是28天"));//正确实例
		assertThat(top.topic2(2000,2),equalTo("2000年2月份的天数是29天"));
	}

}
