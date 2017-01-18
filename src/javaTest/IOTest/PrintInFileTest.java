package javaTest.IOTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class PrintInFileTest {

	public static void main(String[] args) {
		// test.
		printInfile();
	}

	protected static void printInfile() {
		String path = "test/out.txt";
		try {
			// 1.创建输出的文件。
			File out = new File(path);
			if (!out.exists()) {
				out.createNewFile();
			}
			// 2.将文件路径传给输出流。
			PrintStream print = new PrintStream(out.getAbsolutePath());
			// 3.为系统的输出制定流。该流的导向是我们的文件。
			System.setOut(print);
			//4.进行输出测试。
			System.out.println("i am in the file !!!");
		} catch (Exception e) {
		}
	}
}
