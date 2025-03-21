package com.javaex.ex05;

public class Ex08 {

	public static void main(String[] args) {

		int[] no = new int[6];

		for (int i = 0; i < no.length; i++) {
			no[i] = (int) (Math.random() * 45) + 1;
			System.out.println("생성된값:" + no[i]);
			
			for (int j = 0; j < no.length; j++) {
				System.out.print(no[j] + "  ");
			}
			System.out.println("");
			// *중복검사 로직은 1개가 아님 --> 다양하게 연구해 볼것

			// 중복검사
			// i 는 현재 입력된 방번호 <--중복인지 검사해야됨
			// j 비교대상 [0]부터 순서대로 검사해서 i 이전방까지 검사
			// 비교해서 같은 값 방이 나오면 뒤쪽은 검사하지 않음
			for (int j = 0; j < i; j++) {  //  맨첫값(j=0   i=0)은     0<0 이므로 반복문 실행안함 
				if (no[i] == no[j]) {
					no[i] = 0; //랜덤값을 0으로 ->안해도 됨
					i--;
					System.out.println("중복, 0으로 처리, 앞으로한칸이동");
					break;
				}
			}
		}

		
		System.out.println("---최종출력---");
		for (int j = 0; j < no.length; j++) {
			System.out.print(no[j] + "  ");
		}

	}

}
