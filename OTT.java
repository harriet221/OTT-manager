
public class OTT {
	
	private String serviceName;
	private float usingAmount;
	private int price;
	
	public OTT(String n, float u, int p) {
		serviceName = n;
		usingAmount = u;
		price = p;
	}
	
	public void setUsingAmount(float usingAmount) {
		this.usingAmount = usingAmount;
	}

	public String getServiceName() {
		return serviceName;
	}
	
	public float getUsingAmount() {
		return usingAmount;
	}

	public int getPrice() {
		return price;
	}
	
}
