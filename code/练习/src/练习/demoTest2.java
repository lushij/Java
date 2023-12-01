package 练习;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class demoTest2 {
	@Parameters
	public static Collection<?> data() {
		return Arrays.asList(new Object[][] { { "admin@163.com", "145623" }, { "admin@126.com", "123456" } });
	}
	String usr, psd;
	public demoTest2(String usr, String psd) {
		this.usr = usr;
		this.psd = psd;
	}
	@Test
	public void test() {
		assertThat(new demo().MailPsd(this.usr, this.psd), equalTo("登录成功"));
	}
}