package dome;

public class Item {
	private String title;
	private int playingTime;
	private boolean gotIt = false; //根据规则它会有默认的初始值，实际上这里给不给它手动初始化并不重要。
	private String comment;

	public Item() {
		
	}
	
	public Item(String title, int playingTime, boolean gotIt, String comment) {
		super();
		this.title = title;
		this.playingTime = playingTime;
		this.gotIt = gotIt;
		this.comment = comment;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public void print() {
		System.out.print(title);
	}

}
