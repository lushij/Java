package Class;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;//不能和import static org.junit.Assert.assertEquals;一起用
import org.junit.Test;

//import static org.junit.Assert.assertEquals;
import org.junit.Before;

public class TopicTest {
	Topic top;
	@Before
	public void before() {
		top = new Topic();
	}
	
	@Test
	public void AssertThat() {
		assertThat(top.topic2(2022, 10), equalTo("2022年10月份的天数是31天"));//考试需要这种的
	}
}
