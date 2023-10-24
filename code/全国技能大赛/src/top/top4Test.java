package top;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import java.util.Arrays;
import java.util.Collection;

//参数化列表
import org.junit.runner.*;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.*;

//参数化测试需要加上这句话
@RunWith(Parameterized.class)
public class top4Test {
	@Parameters//还有这个
	public static Collection<?>data(){
		return Arrays.asList(
				new Object[][] {
						{"admin","123"},
						{"admin","136"},
						{"admmn","123"}
					}
				);
				
	}
	String usr,pwd;
	//构造函数
	public top4Test(String usr,String pwd) {
		this.usr=usr;
		this.pwd=pwd;
	}
	top4 top ;
	@Before
	public void before() {
		top = new top4();
	}
	@Test
	public void testTop4() {
		assertThat(top.top4(this.usr, this.pwd),equalTo("登录成功"));
	}

}
