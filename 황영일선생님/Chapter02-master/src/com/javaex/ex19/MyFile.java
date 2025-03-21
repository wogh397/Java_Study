package com.javaex.ex19;

import java.io.IOError;
import java.io.IOException;

public class MyFile {

	//필드
	
	//생성자
	
	//메소드 gs
	
	//메소드 일반
	//파일읽기
	public String read(String path) {
		//path 의 파일을 찾는다
		//파일의 내용을 읽는다
		String result ="학교종이 땡땡땡 어서모이자";
		
		return result;
	}
	
	//파일이 없을 경우 가정
	public String read2(String path) {
		
		String result ="";
		
		try {
			//path 의 파일을 찾는다 (*파일이 없다 예외발생)
			//파일의 내용을 읽는다	
			throw new IOException();  //억지로상황만들기
			
		}catch(IOException e) {
			System.out.println("파일이 없습니다.");
		}
		
		return result;
	}
	
	//파일이 없을 경우 가정-->뭘하지마 그냥 알려만줘
	public void read3(String path) throws IOException{
		
		String result ="";
		//path 의 파일을 찾는다 (*파일이 없다 예외발생)
		//파일의 내용을 읽는다	
		throw new IOException();  //억지로상황만들기
		
	}
	
	
	
	
}
