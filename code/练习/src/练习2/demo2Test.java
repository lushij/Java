package 练习2;

import static org.hamcrest.MatcherAssert.*;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.*;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class demo2Test {
@Parameters
	public static Collection<?>data(){
	 	return Arrays.asList(new Object[][] {
	 		{"abcde","替换前缀后的字符串为:efcde"},{"cdbde","大写字母的字符串为:CDBDE"}
	 	});
}

	String str,excpstr;
	public demo2Test(String str,String excpStr) {
		this.excpstr=excpStr;
		this.str=str;
	}
	@Test
	public void test() {
		assertEquals(new demo2().changeAa(this.str),this.excpstr);
	}

}
