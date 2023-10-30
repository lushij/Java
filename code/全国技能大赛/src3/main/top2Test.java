package main;

import static org.hamcrest.MatcherAssert.*;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.*;


import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class top2Test {
@Parameters
public static Collection<?>data(){
	return Arrays.asList(
				new Object[][]{
					{"abcde","替换前缀后的字符串为：efcde"},
				}
			);
}
String str;
String ret;
public top2Test(String str,String ret) {
	this.str=str;
	this.ret=ret;
}
	@Test
	public void test() {
		assertEquals(new top2().top(this.str),ret);
	}

}
