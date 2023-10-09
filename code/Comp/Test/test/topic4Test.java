package test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import Main.topic4;
//参数化测试案例
import org.junit.*;

//加上这句
@RunWith(Parameterized.class)
public class topic4Test {
	@Parameters
	public static Collection<?>data(){
		return Arrays.asList(
				new Object[][]{ {"abc","替换前缀后的字符串为：efc"} }
		//格式  new Object[][] { {数据1},{数据2} }
			);
	}
	//定义变量
	String input;
	String expect;
	//构造函数
	public topic4Test(String input,String expect) {
		this.input=input;
		this.expect=expect;
	}
	topic4 top;
	@Before
	public void main() {
		top = new topic4();
	}
	
	@Test
	public void testStr() {
		String r = top.Str(this.input);
		assertThat(r,equalTo(this.expect));
	}

}
