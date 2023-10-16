package mian;

//导入assertThat包
import static org.hamcrest.MatcherAssert.*;
//导入equalTo包
import static org.hamcrest.CoreMatchers.*;
//导入参数化包
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Collection;
import java.util.Arrays;

import org.junit.*;

@RunWith(Parameterized.class)
public class rewTest {
	@Parameters
	  public static Collection<?>data(){
        return Arrays.asList(
                new Object[][]{ {"abc","替换前缀后的字符串为：efc"} }
        //格式  new Object[][] { {数据1},{数据2} }
            );
    }
	
	
	public rewTest() {
		
	}
	@Test
	public void test() {
		
	}

}
