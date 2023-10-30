package sr;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;;

@RunWith(Parameterized.class)
public class tp1Test2ByRun {
@Parameters
public static Collection<?>data(){
	return Arrays.asList(
				new Object[][] {
					{2023,2},
					{2022,2}
				}
			);
			
}
	int year;
	int month;
	public tp1Test2ByRun(int year,int month) {
		this.year=year;
		this.month=month;
	}
	@Test
	public void test() {
		assertEquals(new tp1().runnian(this.year, this.month), expectString(this.year, this.month));
		//assertEquals(new tp1().runnian(this.year, this.month),"2023年的2月份的天数为：29天");
		//assertEquals(new tp1().runnian(this.year, this.month),"2022年的2月份的天数为：29天");
	}

	public static String expectString(int year ,int month) {
		if (month != 2) {
	        return year + "年的" + month + "月份的天数为：30天";
	    } else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
	        return year + "年的2月份的天数为：29天";
	    } else {
	        return year + "年的2月份的天数为：28天";
	    }
		
	}
}
