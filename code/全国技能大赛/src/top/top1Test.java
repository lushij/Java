package top;

import static org.junit.Assert.*;

import org.hamcrest.core.StringStartsWith;
import org.junit.*;

public class top1Test {
	top1 top;
	@Before
	public void before() {
		top = new top1();
	}
	@Test
	public void testTop1() {
		String ret = top.top1(1, 5);
		
		assertTrue(ret.startsWith("x=a+b的值：6"));
	}
	@Test
	public void testTop2() {
		String ret = top.top1(-1, -5);
		assertTrue(ret.startsWith("x=a-b的值：9"));
	}
}
