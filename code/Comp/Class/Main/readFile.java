package Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class readFile {

	public static void str1() {
		
        File dir = new File("../file.txt");
        String[] children = dir.list();
        if (children == null) {
            System.out.println("该目录不存在");
        }
        else {
            for (int i = 0; i < children.length; i++) {
                String filename = children[i];
                System.out.println(filename);
            }
        }
		    
	}
	public static void main(String[] args) throws IOException {

		String path = System.getProperty("user.dir")+"\\Class\\Main\\file.txt";       
		//打开文件
		File file=new File(path);
		//读取文件 先按二进制读取
		
		FileReader bytes = new FileReader(file);
		//在转换文本数据
		BufferedReader data = new BufferedReader(bytes);
		String txt=null;
		int row=0;
		while((txt =data.readLine())!=null)
		{
			row++;
		}
		System.out.println(row);
//		str1();
//		System.out.println(path);

	}
}
