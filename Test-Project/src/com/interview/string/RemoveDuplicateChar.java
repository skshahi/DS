package com.interview.string;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		String str = "abacadc";
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			int count = 0;

			char ch = str.charAt(i);
			if (temp.isEmpty()) {

				temp += ch;
			}
			for (int j = 0; j < temp.length(); j++) {

				char ch1 = temp.charAt(j);
				if (ch == ch1) {

					break;
				}

				count++;
			}
			if (count == temp.length()) {

				temp = temp.concat(ch + "");
			}
		}
		System.out.println(temp);

	}

}
