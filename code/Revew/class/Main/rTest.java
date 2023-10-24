package Main;


import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import org.junit.*;

public class rTest {

	rew r;
	@Before
	public void before() {
		r=new rew();
	}
	@Test
	public void test() {
		assertThat(r.topic1(1),equalTo(1));
	}

}
