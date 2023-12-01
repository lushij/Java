package text;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.*;
public class top3Test {	
	@Test
	public void test() {
//		assertThat(new top3().Getprofit(60),is("总提成：60*0.03"));//失败例子
		assertThat(new top3().Getprofit(60),is("总提成：1.7999999999999998万"));
	}
}
