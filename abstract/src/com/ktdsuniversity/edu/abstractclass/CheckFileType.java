package com.ktdsuniversity.edu.abstractclass;

/**
 * 파일의 확장자를 체크하는 기능
 */
public class CheckFileType extends AbstractFileTypeChecker {

	/**
	 * 확장자를 가지고 있는 파일의 이름 ==>확장자 체크를 하려는 파일의 정보
	 */
	public CheckFileType(String fileName) {
		super(fileName);

	}

	@Override
	public boolean compareType() {
		return fileName.toLowerCase().endsWith(".jpg");
	}

}
