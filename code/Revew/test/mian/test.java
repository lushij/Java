package mian;

import static org.hamcrest.MatcherAssert.*;//导入assertThat

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.*;//导入equalTo


import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import Main.rew;

@RunWith(Parameterized.class)
public class test {
	@Parameters
	public static Collection<?>data(){
		return Arrays.asList( new Object[][] {{1,2},{1,1}});
	}
	int input;
	int excpet;
	public test(int input,int excpet) {
		this.excpet=excpet;
		this.input=input;
	}
	rew Rew ;
	@Before
	public void top() {
		Rew = new rew();
	}
	@Test
	public void toptest() {
		assertThat(excpet,equalTo(input));
	}
}
