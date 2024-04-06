package fileTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest2 {
	public static void main(String[] args) {
		File f = new File("../test18.txt");

		try {
			FileOutputStream fos = new FileOutputStream(f);
			System.out.println("파일 생성");
			fos.write('a');
			System.out.println("a 추가");
			fos.write('b');
			System.out.println("b 추가");
			fos.write('c');
			System.out.println("c 추가");

			fos.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
