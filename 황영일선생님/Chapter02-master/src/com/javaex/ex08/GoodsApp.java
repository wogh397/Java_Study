package com.javaex.ex08;

public class GoodsApp {

	public static void main(String[] args) {

		
		Goods[] goodsArray = new Goods[3];
		
		
		System.out.println("--------------------------");
		
		Goods computer = new Goods("LG그램", 10000000);
		Goods cup = new Goods("머그컵", 2000);
		Goods camera = new Goods("니콘", 400000);
		
		//배열에 상품주소 추가 (자주 안한다)
		goodsArray[0] = computer;
		goodsArray[1] = cup;
		goodsArray[2] = camera;
		
		System.out.println(cup.getName());
		System.out.println(goodsArray[1].getName());
		
		
		System.out.println("--------------------------");
		
		for(int i=0; i<goodsArray.length; i++) {
			
			goodsArray[i].showInfo();
				
		}
		
		
		
		
		
		
		
	}

}
