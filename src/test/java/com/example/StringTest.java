package com.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * String 기본 사용법 숙지
 */
public class StringTest {
	private static String text;

	@BeforeAll
	public static void init() {
		text = "Hello World ";
	}

	@Test
	@DisplayName("공백제거")
	public void trim() {
		System.out.println(text.trim());
	}

	@Test
	@DisplayName("대소문자 변경")
	public void toCase() {
		System.out.println(text.toUpperCase());
		System.out.println(text.toLowerCase());
	}

	@Test
	@DisplayName("문자 비교")
	public void equals() {
		String temp = new String("Hello World ");

		System.out.println(text == temp);
		System.out.println(text.equals(temp));
	}

	@Test
	@DisplayName("문자열 쪼개기")
	public void split() {
		String[] array = text.split(" ");

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	@Test
	@DisplayName("문자 인덱싱")
	public void indexOf() {
		System.out.println(text.indexOf("Hello"));
		System.out.println(text.indexOf("World"));
		System.out.println(text.indexOf("w"));
		System.out.println(text.indexOf("!!"));
	}

	@Test
	@DisplayName("문자열 자르기")
	public void substring() {
		System.out.println(text.substring(0, 5));
		System.out.println(text.substring(7));
		System.out.println(text.substring(7));

		int startIndex = text.indexOf("World");
		System.out.println(text.substring(startIndex));
	}
}
