package soc;

import static org.hamcrest.MatcherAssert.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.*;


import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class top4Test {
@Parameters
public static Collection<?>data(){
	return Arrays.asList(
				new Object[][] {
					{"abcd","替换前缀后的字符串为：efcd"},
					{"acbbcd","替换cd后的字符串为：acbbgh"}
				}
			);
}

	String usr,pwd;
	public top4Test(String usr,String pwd) {
		this.pwd=pwd;
		this.usr=usr;
	}
	@Test
	public void testTop4() {
		assertThat(new top4().top4(this.usr),equalTo(this.pwd));
	}

}
