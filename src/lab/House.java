package lab;

public class House {
	
	//parameters
	
	private int squareft;
	private double bathrooms;
	private double bedrooms;
	private int cost;
	private String address;
	private double lotsize;
	private boolean haspool;
	private String image;
	
	
	//constructors
	public House(int squareft, double bathrooms, double bedrooms, int cost, String address, double lotsize, boolean haspool, String image) {
		this.squareft = squareft;
		this.bathrooms = bathrooms;
		this.bedrooms = bedrooms;
		this.cost = cost;
		this.address= address;
		this.lotsize= lotsize;
		this.haspool= haspool;
		this.image=image;

	}
	
	//getter methods
	int getsquareft() { return squareft; }
	double getbathrooms() { return bathrooms; }
	double getbedrooms() {return bedrooms; }
	int getcost() {return cost; }
	public String getaddress() { return address; }
	public double getlotsize() { return lotsize; }
	public boolean gethaspool() {return haspool; }
	public String getimage() {return image; }
	
	
	@Override
	public String toString() {
		return "House 1 is " + squareft + "large, has " + bathrooms + " bathrooms, " + bedrooms + 
				" bedrooms that cost " + cost + ". The house address is" + address +" The lot size is" +lotsize+ "ft and it"+ haspool+" here is an "+ image;
	}

}