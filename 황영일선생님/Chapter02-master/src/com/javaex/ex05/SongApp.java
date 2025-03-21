package com.javaex.ex05;

public class SongApp {

	public static void main(String[] args) {
		
		Song s01 = new Song();   //Song()
		s01.setTitle("좋은날");
		s01.setArtist("아이유");
		s01.setAlbum("Real");
		s01.setComposer("이민수");
		s01.setYear(2010);
		s01.setTrack(3);
		
		System.out.println("-------------------------");
		
		//5개  //Song(5)
		Song s02 = new Song("거짓말","BIGBANG","Always","G-DRAGON",2007);
	    s02.setTrack(2);
	    
	    System.out.println("-------------------------");
	    
		//6개 //Song(5) Song(6)
		Song s03 = new Song("벚꽃앤딩","버스커버스커","Always","G-DRAGON",2012, 5);		
	}

}
