package com.itskennedy.corsoCloudDeveloper;

public class StringUtils {

	public static boolean isNullOrEmpty(String in) {
		return in == null || in.length()==0;
	}

	public static boolean isNotNullOrEmpty(String in) {
		return !isNullOrEmpty(in);
	}
}
