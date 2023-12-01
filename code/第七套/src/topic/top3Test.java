package topic;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.runner.*;
import org.junit.runners.*;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.parameterized.*;
import org.junit.Test;
@RunWith(Parameterized.class)
public class top3Test {
	@Parameters
	public static Collection<?> data() {
		return Arrays.asList(new Object[][] { { "admin", "123" }, { "1", "2" } });
	}
	String name;
	String pwd;
	top3Test(String name,String pwd)
	{
		this.name=name;
		this.pwd=pwd;
	}
	@Test
	public void test() {
		assertThat(new top3().mail(this.name, this.pwd), equalTo("123"));
	}
}




