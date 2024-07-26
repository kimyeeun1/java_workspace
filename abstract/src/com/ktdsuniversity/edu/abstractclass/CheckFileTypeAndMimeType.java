package com.ktdsuniversity.edu.abstractclass;

import java.util.Random;

public class CheckFileTypeAndMimeType extends AbstractFileTypeChecker {

	public CheckFileTypeAndMimeType(String fileName) {
		super(fileName);
	}

	public boolean compareType() {

		return isJPEGFile() && isImageMimeFile();

	}

	private boolean isJPEGFile() {
		return fileName.toLowerCase().endsWith(".jpg");
	}

	private boolean isImageMimeFile() {

		String mimeTypeOfFile = getMimeTypeOfFile();

		boolean isImageFile = mimeTypeOfFile.equals("image/jpeg") || mimeTypeOfFile.equals("image/gif");

		System.out.println(fileName + "의 mimType은 " + mimeTypeOfFile + "입니다.");

		return isImageFile;

	}

	private String getMimeTypeOfFile() {
		String[] mimeTypes = { "image/jpeg", "image/gif", "audio/mp3", "video/avi" };

		Random random = new Random();
		return mimeTypes[random.nextInt(mimeTypes.length)];
	}

	/**
	 * 추상클래스에 포함되어있는 추상메소드는 서브 클래스에서 반드시 오버라이딩 해야한다
	 */

}
