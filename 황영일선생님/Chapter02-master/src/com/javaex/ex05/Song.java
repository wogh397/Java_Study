package com.javaex.ex05;

public class Song {

	// 필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;

	// 생성자
	public Song() {//메모리에 올리기
		System.out.println("Song()");
	}

	// 필드5개
	public Song(String title, String artist, String album, String composer, int year) {
		//메모리에 올리기
		this.title = title;
		this.artist = artist;
		this.album = album; // 로직
		
		this.composer = composer; // 로직

		if (year >= 2000) { // 로직
			this.year = year;
		} else {
			this.year = 0;
		}
		System.out.println("Song(5)");
	}

	// 필드6개
	public Song(String title, String artist, String album, String composer, int year, int track) {
		//메모리에 올리기
		this(title, artist, album, composer, year);  // Song(5개)
		this.track = track;
		System.out.println("Song(6)");
		
	}

	// 메소드 gs
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}

	// 메소드 일반
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}

}
