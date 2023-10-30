package main;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;


import org.junit.*;

import sr.tp1;

public class top1Test {

	@Test
	public void testTop() {
		assertThat(new top1().top("abcde", "123564"),containsString("注册成功"));
	}

}
