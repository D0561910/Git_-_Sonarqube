package com.example;

// import org.apache.commons.codec.binary.Base64;

import java.util.Arrays;

/**
 * 範例主程式
 */
public class Main {
	/**
	 * nextDate() 功能
	 * 
	 * @return 回傳月與日期
	 */
	public String checkTriangle(double a, double b, double c) {
		double line[] = new double[3];
		line[0] = a;
		line[1] = b;
		line[2] = c;
		Arrays.sort(line);

		// a + b > c 就是三角形
		if (line[0] + line[1] > line[2]) {
			if ((int) (line[2] * line[2]) == (int) (line[1] * line[1]) + (int) (line[0] * line[0])) {
				if (line[2] == line[1] || line[2] == line[0] || line[1] == line[0]) {
					return "是等腰直角三角形";
				} else {
					return "是直角三角形";
				}
			} else if (line[0] == line[1] && line[1] == line[2]) {
				return "是等边三角形";
			} else if (line[2] == line[1] || line[2] == line[0] || line[1] == line[0]) {
				return "是等腰三角形";
			} else {
				return "是三角形";
			}
		} else {
			return "三条边不能构成三角形";
		}
	}
}
