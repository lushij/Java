package test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;
import org.junit.Before;
import Main.topic3;

public class topic3Test {
	topic3 top;
	@Before
	public void before() {
		top = new topic3();
	}
	@Test
	public void testTopic1() {
		assertThat(top.Quaaddr("Lu", "17538593706", "A123456789"),
				equalTo("OK"));//成功
		assertThat(top.Quaaddr2("Lu", "17538593706", "A123456789"),
				equalTo("OK"));//成功
//		assertThat(top.Quaaddr("Lu", "17538593706", "1123456789"),
//				equalTo("OK"));//地址错误
//		assertThat(top.Quaaddr2("Lu", "17538593706", "1123456789"),
//				equalTo("OK"));//
		assertThat(top.Quaaddr("Lu", "1753853706", "A123456789"),
				equalTo("OK"));//手机号不符合要求
		assertThat(top.Quaaddr2("Lu", "1753893706", "A123456789"),
				equalTo("OK"));//
	}

	

}
