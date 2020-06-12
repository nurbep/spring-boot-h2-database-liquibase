package com.hhimanshu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		String s1="me";
		String s2="he";
		String s3= String.format("%s/%s", s1,s2);
		
		System.out.println(s3);
		
		Boolean isTrue = false;
		System.out.println(Boolean.TRUE.equals(isTrue));
		
		String timesheetsApi = "timesheetsApi";
		int employeeProjectId = 3;
		System.out.println(String.format("%s/employeeprojects/%s", timesheetsApi, employeeProjectId));

	}}
