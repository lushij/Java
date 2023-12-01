package 练习;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import org.junit.Test;
public class demoTest {
	@Test
	public void test() {
		assertThat(new demo().MailPsd("abcde@163.com", "123456"), equalTo("登录成功"));
	}
}
