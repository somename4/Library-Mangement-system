package entities;

public class Customer {
    private int id;
	private String name, firstName, adress, city, zipCode;
	private boolean feesPayed;

	public Customer(int id, String name, String firstName, String adress, String city, String zipCode,
			boolean feesPayed) {
		this.id= id;
		this.name=name;
		this.firstName=firstName;
		this.adress=adress;
		this.city=city;
		this.zipCode=zipCode;
		this.feesPayed=feesPayed;
	}


	public void printCostumersInfo(){
		System.out.println(id+"\t"+name+"\t"+firstName+"\t"+adress+"\t"+city+"\t"+zipCode+"\t"+feesPayed);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public boolean isFeesPayed() {
		return feesPayed;
	}

	public void setFeesPayed(boolean feesPayed) {
		this.feesPayed = feesPayed;
	}
    
}
