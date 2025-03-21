package com.javaex.ex00;

import java.util.Scanner;

public class FriendsApp {

	public static void main(String[] args) {
		
		Friend[] friendArray= new Friend[3];
		
		Scanner sc = new Scanner(System.in);

		for(int i=0; i<friendArray.length; i++) {
			Friend friend = new Friend(); //밀가루
			
			//속넣기 //정보넣기
			String name = sc.nextLine();
			String hp = sc.nextLine();
			String school = sc.nextLine();
			friend.setName(name);
			friend.setHp(hp);
			friend.setSchool(school);
			
			//박스에 넣기 //입주
			friendArray[0] = friend;
			////
		}
		
		sc.close();
	}

}
