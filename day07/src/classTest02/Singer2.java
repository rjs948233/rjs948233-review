package classTest02;

public class Singer2 {
	//필드
	String artist;
	String title;
	String album;
	
	//생성자
	public Singer2() {
		super();
	}

	public Singer2(String artist, String title, String album) {
		super();
		this.artist = artist;
		this.title = title;
		this.album = album;
	}
	
	//메소드
	void artistInfo() {
		System.out.println("노래제목 : "+title);
		System.out.println("가수명 :"+artist);
		System.out.println("앨범명 : "+album);
	}
}
