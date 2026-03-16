package hungerbirdsmodels;

public class cardsmodel {
	private int id;
	private String src;
	private String alt;
	private String title;
	private String descripition;
	private int price;
	private String button1;
	private String button2;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	public String getAlt() {
		return alt;
	}
	public void setAlt(String alt) {
		this.alt = alt;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescripition() {
		return descripition;
	}
	public void setDescripition(String descripition) {
		this.descripition = descripition;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getButton1() {
		return button1;
	}
	public void setButton1(String button1) {
		this.button1 = button1;
	}
	public String getButton2() {
		return button2;
	}
	public void setButton2(String button2) {
		this.button2 = button2;
	}
	public cardsmodel(int id, String src, String alt, String title, String descripition, int price, String button1,
			String button2) {
		super();
		this.id = id;
		this.src = src;
		this.alt = alt;
		this.title = title;
		this.descripition = descripition;
		this.price = price;
		this.button1 = button1;
		this.button2 = button2;
	}
	public cardsmodel() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}