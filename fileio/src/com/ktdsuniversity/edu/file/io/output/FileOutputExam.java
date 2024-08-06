package com.ktdsuniversity.edu.file.io.output;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class FileOutputExam {

	public static void main(String[] args) {
		// 파일쓰기 ==> 폴더생성

		// 1. 어디에 어떤 파일을 쓸 것인지 정의
		File file = new File("C:\\java\\output", "java_output.txt");

		// 2. 파일을 쓰려는 경로가 존재하는가?
		if (!file.getParentFile().exists()) { // C:\\java\\output이 존재하지 않는다면
			// 존재하지 않는다면 경로를 생성(폴더를 생성)
			file.getParentFile().mkdirs(); // 전체 경로가 생성 (전체 폴더가 생성)
		}

		// 3. 쓰려는 파일이 이미 존재하는가?
		int index = 1;

		// 존재한다면 중복되지 않는 이름을 찾는다
		String fileName = file.getName(); // 파일의 이름(확장자 포함)

		while (file.exists()) {
			// 파일의 이름에 순번을 부여하고 싶다(예) java_output (1).txt)
			// 3-1. 파일의 이름에서 확장자를 분리한다
			String fileNameWithoutExtention = fileName.substring(0, fileName.lastIndexOf("."));
			String extention = fileName.substring(fileName.lastIndexOf("."));

			// 3-2. 확장자가 분리된 파일의 이름에 순번을 부여한다
			fileNameWithoutExtention += " (" + (index++) + ")";

			// 3-3. 확장자와 파일의 이름을 연결한다
			String tempFileName = fileNameWithoutExtention + extention;

			file = new File(file.getParentFile(), tempFileName);
		}

		// 4. 중복되지 않는 파일에 내용을 작성한다
		List<String> fileDescription = new ArrayList<>();
		fileDescription.add("파일의 내용을 씁니다.1");
		fileDescription.add("파일의 내용을 씁니다.2");
		fileDescription.add("파일의 내용을 씁니다.3");
		fileDescription.add("파일의 내용을 씁니다.4");
		fileDescription.add("파일의 내용을 씁니다.5");

		try {
			Files.write(file.toPath(), fileDescription, Charset.defaultCharset());
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}
		System.out.println(file.getAbsolutePath());
	}
}
