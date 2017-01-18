package javaTest.IOTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class ExceptionInFileTest {

	public static void main(String[] args) throws IOException {
		// test.
		printInfile();
	}

	protected static void printInfile() throws IOException {
		String path = "test/out.txt";
		try {
			throw new Exception("mistakes !!!");
		} catch (Exception e) {
			File out = new File(path);
			if (!out.exists()) {
				out.createNewFile();
			}
			PrintStream print = new PrintStream(out.getAbsolutePath());
			//e��������ӵ��һ��������ģ��������ǽ�������Ϊ��** ���ǵ�IO�� **��
			e.printStackTrace(print);
		}
	}
}
