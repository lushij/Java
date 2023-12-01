package text;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class top4Test {//参数化测试
	@Parameters
	public static Collection<?>data(){//参数化配置
		return Arrays.asList(
				new Object[][] {
						{"abcede","替换前缀后的字符串为：efcede"},
						{"admin","qweerrr"},
						{"admmn","123"}
					}
				);		
	}
	String preStr;
	String tailStr;
	public top4Test(String preStr,String tailStr)
	{
		this.preStr=preStr;
		this.tailStr=tailStr;
	}
	@Test
	public void test() {
		assertEquals(new top4().replaceA(this.preStr),this.tailStr);
	}
}
