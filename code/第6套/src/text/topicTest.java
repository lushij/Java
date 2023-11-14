package text;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.*;

public class topicTest {

	topic top;
	@Before
	public void before()
	{
		top=new topic();
	}
	@Test
	public void test() {
		//使用assertThat中equalTo断言判断期望结果值和实际返回值是否一致。
		assertThat(top.top1(80, 90),equalTo(0));//成功例子
		assertThat(top.top1(50, 80),equalTo(0));//失败例子，正确应该是3
		
	}

}
