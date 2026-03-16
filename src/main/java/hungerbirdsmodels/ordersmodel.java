package hungerbirdsmodels;

public class ordersmodel {
	private int id;
	private String itemname;
	private String address;
	private String confirmaddress;
	private String doornumber;
	private int mobilenumber;
	private String state;
	private String pincode;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getConfirmaddress() {
		return confirmaddress;
	}
	public void setConfirmaddress(String confirmaddress) {
		this.confirmaddress = confirmaddress;
	}
	public String getDoornumber() {
		return doornumber;
	}
	public void setDoornumber(String doornumber) {
		this.doornumber = doornumber;
	}
	public int getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(int mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public ordersmodel(int id, String itemname, String address, String confirmaddress, String doornumber,
			int mobilenumber, String state, String pincode) {
		super();
		this.id = id;
		this.itemname = itemname;
		this.address = address;
		this.confirmaddress = confirmaddress;
		this.doornumber = doornumber;
		this.mobilenumber = mobilenumber;
		this.state = state;
		this.pincode = pincode;
	}
	public ordersmodel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
