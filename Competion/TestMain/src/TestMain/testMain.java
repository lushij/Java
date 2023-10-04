package TestMain;

//测试用例
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class testMain {

	@Test
	public void test_main() {
		 Main main=new Main();
		 String ret=main.logAdmin("admin", "123456");
		 Assert.assertEquals("你的登录可能有问题", "登录成功",ret);
	}
	
	@Test
	public void testPeople() {
		 Main main=new Main();
		 int ret=main.ReadPeople("name1", 1);
		 Assert.assertEquals("信息不对", 1,ret);
	}
}
