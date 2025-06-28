package dome;

public class CD extends Item { //extend；CD是一种特殊的Item
	private String artist;
	private int numofTracks;
	
	public CD(String title, String artist, int numofTracks, int playingTime, String comment) {
		super(title, playingTime, false, comment);
//		this.title = title;
		this.artist = artist;
		this.numofTracks = numofTracks;
//		this.playingTime = playingTime;
//		this.comment = comment;
	}

	@Override
	public String toString() {
		return "CD [artist=" + artist + ", numofTracks=" + numofTracks + ", toString()=" + super.toString() + "]";
	}
	

	@Override
	public boolean equals(Object obj) {
		CD cc = (CD)obj;
		return artist.equals(cc.artist);
	}

	public static void main(String[] args) {
		CD cd = new CD("a","b",2,2,"...");
		CD cd1 = new CD("a","b",2,2,"...");
		cd.print();
		String s = "aa" + cd;
		System.out.println(s);
		System.out.println(cd.equals(cd1));
	}

//	public void print() {
//		// 选择成员变量中一些有意义的东西输出
//		System.out.println("CD:"+title+":"+artist);
//		
//	}


}
