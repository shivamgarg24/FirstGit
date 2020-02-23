package com.cyb.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

public class TestIP {

	public static void main(String[] args) {
		Pattern pattern;
		Matcher matcher;

		final String IPADDRESS_PATTERN = "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
				+ "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
				+ "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
				+ "([01]?\\d\\d?|2[0-4]\\d|25[0-5])";

		List<String> ipList = new ArrayList<String>();
		String dest = null;
		String src = null;

		pattern = Pattern.compile(IPADDRESS_PATTERN);

		String fireWalString = "ip is www match eq 102.168.201.10 is gt  102.168.200.11 fr de";
		matcher = pattern.matcher(fireWalString);

		while (matcher.find()) {
			ipList.add(matcher.group(0));
		}
		src = ipList.get(0);
		dest = ipList.get(1);
		System.out.println(src + "   " + dest);
		String[] fireWalStringArray = StringUtils.split(fireWalString);
		List<String> testUnmodifiedList = Arrays.asList(fireWalStringArray);
		List<String> testList = new ArrayList<String>();
		testList.addAll(testUnmodifiedList);
		testList.remove(src);
		testList.remove(dest);

		for (String string : testList) {

			System.out.print(string + " ");

		}

	}
}