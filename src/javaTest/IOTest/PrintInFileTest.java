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
			// 1.����������ļ���
			File out = new File(path);
			if (!out.exists()) {
				out.createNewFile();
			}
			// 2.���ļ�·�������������
			PrintStream print = new PrintStream(out.getAbsolutePath());
			// 3.Ϊϵͳ������ƶ����������ĵ��������ǵ��ļ���
			System.setOut(print);
			//4.����������ԡ�
			System.out.println("i am in the file !!!");
		} catch (Exception e) {
		}
	}
}
