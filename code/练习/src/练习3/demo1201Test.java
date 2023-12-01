package 练习3;

//import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class demo1201Test {

	@Test
	public void test() {
		assertThat(new demo1201().Mail("admin@163.com", "123456"),equalTo("信息正确"));
//		assertThat(new demo1201().Mail("admin@162.com", "123456"),equalTo("信息正确"));
		assertThat(new demo1201().Mail("admin@126.com", "123456"),equalTo("信息正确"));
	}

}
