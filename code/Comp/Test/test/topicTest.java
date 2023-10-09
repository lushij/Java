package test;



//import static org.junit.Assert.assertThat;
import static org.hamcrest.MatcherAssert.assertThat;//assertThat 使用包
//import static org.hamcrest.Matcher.*;
import static org.hamcrest.CoreMatchers.*;//equalTo使用包


import org.junit.Before;
import org.junit.Test;

import Main.topic;
public class topicTest {
	
	topic top;
	@Before
	public void main() {
		top = new topic();
	}
	@Test
	public void test() {
		//assertThat(top.topic1(80, 90),equalTo(2));//错误示例
		assertThat(top.topic1(70, 70),equalTo(3));//成功测试实例
	}
	
}

