package test;

import static org.hamcrest.MatcherAssert.*;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class topTest4 {
	@Parameters
	public static Collection<?>data(){
		return Arrays.asList(new Object[][] {
			{"admin","123"},{"admin","1235"}
		});
	}
	String name;
	String psd;
	
	
	public topTest4(String name,String psd)
	{
		this.name=name;
		this.psd=psd;
	}
	@Test
	public void test() {
		assertThat(new top().top4(name, psd),equalTo("登录成功"));
	}

}
