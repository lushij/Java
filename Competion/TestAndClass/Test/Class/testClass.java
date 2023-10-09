package Class;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Before;
import org.junit.Test;


public class testClass {
	Topic top;
	@Before
	public void before() {
		top=new Topic();
	}
	@Test
	public void test() {
		assertThat(top.topic3("17538693869", "a123567890"), equalTo("OK"));
		assertThat(top.topic3("1753869386", "a123567890"), equalTo("OK"));
		assertThat(top.topic3("17538693869", "11235617890"), equalTo("OK"));
		assertThat(top.topic3("17538693869", "11235617890"), equalTo("OK"));
		assertThat(top.topic3("1753008693869", "11235617890"), equalTo("OK"));
	}
	
	
}

