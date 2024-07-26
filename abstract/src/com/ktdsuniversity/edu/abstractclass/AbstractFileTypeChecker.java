package com.ktdsuniversity.edu.abstractclass;

public abstract class AbstractFileTypeChecker {

	protected String fileName;

	public AbstractFileTypeChecker(String fileName) {

		this.fileName = fileName;
	}

	public boolean isImageFile() {
		return compareType();
	}

	public abstract boolean compareType();
}
