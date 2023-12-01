package 练习2;

import static org.hamcrest.MatcherAssert.*;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class DemoTest {
@Parameters
	public static Collection<?>data(){
		return Arrays.asList(new Object[][]{
				{"admin@163.com","123456"},{"admin@162.com.cn","123456"}
		});
		
}
	String usr,psd;
	public DemoTest(String usr,String psd) {
		this.psd=psd;
		this.usr=usr;
	}
	@Test
	public void test() {
		assertThat(new Demo().MailPsd(this.usr,this.psd),equalTo("登陆成功"));
	}

}
