package com.ktdsuniversity.edu.file.io.input;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

/**
 * Java 1.8 이후부터 사용 가능한 심플한 코드
 */
public class NewFileInput {

	public static void main(String[] args) {
		// 1. 읽어들일 파일 인스턴스 생성
		File file = new File("C://java exam", "javaexam.txt");

		// 2. 읽을 파일이 존재하는지 확인 && 읽을 파일이 파일 타입인지 확인
		if (file.exists() && file.isFile()) {
			// 3. 파일을 읽어서 List에 할당
			List<String> fileLines = null;
			try {
				fileLines = Files.readAllLines(file.toPath(), Charset.defaultCharset());
			} catch (IOException ioe) {
				System.out.println(ioe.getMessage());
			}

			// 4. List를 모두 출력

			if (fileLines != null) {
				for (String line : fileLines) {
					System.out.println(line);
				}
			}
		}

		// 4. List를 모두 출력
	}
}
