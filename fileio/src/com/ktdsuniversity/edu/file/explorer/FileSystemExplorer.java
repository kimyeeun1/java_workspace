package com.ktdsuniversity.edu.file.explorer;

import java.io.File;

public class FileSystemExplorer {

	/**
	 * 지정한 경로 아래에 있는 모든 파일들의 전체 경로를 출력
	 * 
	 * @param dir : 지정한 경로
	 */
	public void explorer(File dir) {
		if (dir.exists() && dir.isDirectory()) { // dir이 존재하고 폴더라면
			File[] itemInDir = dir.listFiles(); // itemInDir 배열 변수에 모든 파일 목록을 넣는다
			for (File item : itemInDir) { // itemInDir를 item으로 변수선언
				if (item.isDirectory()) { // item이 폴더라면
					explorer(item);// Recursive Call //explorer메소드에 item파라미터를 넣는다
				} else { // 폴더가 아닌 경우
					System.out.println(item.getAbsolutePath()); // item의 절대경로를 출력한다
				}
			}
		} else if (dir.exists() && dir.isFile()) { // dir이 존재하고 파일인 경우
			System.out.println(dir.getAbsolutePath()); // dir의 절대 경로를 출력한다
		}
	}

	public static void main(String[] args) {
		FileSystemExplorer fse = new FileSystemExplorer();
		File dir = new File("C:\\dev\\java_workspace");
		fse.explorer(dir);
	}

}
