
public class Address {
	String street1;
	String state;
	String city;
	int zipcode;
	
	public Address(){
		
	}
	
	public Address(String street1, String state, String city, int zipcode) {
		this.street1 = street1;
		this.state = state;
		this.city = city;
		this.zipcode = zipcode;
	}

	public String getStreet1() {
		return street1;
	}

	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
}
