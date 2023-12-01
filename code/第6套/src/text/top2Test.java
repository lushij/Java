package text;
import static org.junit.Assert.*;
import org.junit.Test;
public class top2Test {
	@Test
	public void test() {
		assertEquals(new top2().top(3, 4, 5),"能组成普通三角形");//成功例子
		assertEquals(new top2().top(3, 3, 5),"能组成普通三角形");//失败例子
	}
}
