package com.ktdsuniversity.edu.file.remove;

import java.io.File;

public class RemoveMulti {

	public void removeAllFiles(File removeDir) {
		if (removeDir.exists() && removeDir.isDirectory()) { // dir이 존재하고 폴더라면
			File[] itemInDir = removeDir.listFiles(); // itemInDir 배열 변수에 모든 파일 목록을 넣는다
			for (File item : itemInDir) { // itemInDir를 item으로 변수선언
				if (item.isDirectory()) { // item이 폴더라면
					removeAllFiles(item);// Recursive Call //explorer메소드에 item파라미터를 넣는다
				} else { // 폴더가 아닌 경우
					item.delete();
				}
			}
			removeDir.delete();
		} else if (removeDir.exists() && removeDir.isFile()) { // dir이 존재하고 파일인 경우
			System.out.println(removeDir.delete()); // dir의 절대 경로를 출력한다
		}
	}

	public static void main(String[] args) {
		RemoveMulti removeMulti = new RemoveMulti();
		File removeDir = new File("C:\\java");
		removeMulti.removeAllFiles(removeDir);
	}
}
