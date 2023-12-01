package 练习2;

//import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class demo3Test {
	@Parameters
	public static Collection<?>data(){
		return Arrays.asList(new Object[][] {
			{10,5},{10,6}
		});
	}
	
	int x,y;
	public demo3Test(int x,int y) {
		this.x=x;
		this.y=y;
	}
	@Test
	public void test() {
		assertThat(new demo3().getVal(this.x, this.y),equalTo(10));
	}

}
