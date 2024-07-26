package com.ktdsuniversity.edu.abstractclass;

import java.util.Random;

public class CheckFileMimeType extends AbstractFileTypeChecker {

	public CheckFileMimeType(String fileName) {

		super(fileName);

	}

	private String getMimeTypeOfFile() {
		String[] mimeTypes = { "image/jpeg", "image/gif", "audio/mp3", "video/avi" };

		Random random = new Random();
		return mimeTypes[random.nextInt(mimeTypes.length)];
	}

	/*
	 * public boolean isImageFile() {
	 * 
	 * String mimeTypeOfFile = getMimeTypeOfFile();
	 * 
	 * boolean isImageFile = mimeTypeOfFile.equals("image/jpeg") ||
	 * mimeTypeOfFile.equals("image/gif");
	 * 
	 * System.out.println(fileName + "의 mimType은 " + mimeTypeOfFile + "입니다.");
	 * 
	 * return isImageFile; }
	 */

	@Override
	public boolean compareType() {

		String mimeTypeOfFile = getMimeTypeOfFile();

		boolean isImageFile = mimeTypeOfFile.equals("image/jpeg") || mimeTypeOfFile.equals("image/gif");

		System.out.println(fileName + "의 mimType은 " + mimeTypeOfFile + "입니다.");

		return isImageFile;

	}
}
