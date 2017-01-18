package javaTest.IOTest;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileTest {
	public static Map<String, Integer> fileCount = new HashMap<>();

	public static void main(String[] args) throws IOException {
		String path = "test/out.txt";
		createFileWithoutRepeat(path);
	}

	public static String getNewName(String path, String suffix, int count) {
		String newPath = path.substring(0, path.lastIndexOf(suffix));
		StringBuilder sb = new StringBuilder();
		sb.append(newPath).append("(").append(count).append(")").append(suffix);
		return sb.toString();
	}

	/*
	 * 存在的问题，所在的文件夹最初的时候需要是空的。
	 */
	public static void createFileWithoutRepeat(String path) throws IOException {
		System.out.println("start ...");

		File file = new File(path);
		if (!file.exists()) {
			file.createNewFile();
			fileCount.put(file.getName(), 1);
		} else {
			if (!fileCount.containsKey(file.getName())) {
				fileCount.put(file.getName(), 1);
			}

			int count = fileCount.get(file.getName());
			File newFile = new File(getNewName(path, ".txt", ++count));
			if (!newFile.exists()) {
				newFile.createNewFile();
			}
		}
		System.out.println("end ...");
	}
}
