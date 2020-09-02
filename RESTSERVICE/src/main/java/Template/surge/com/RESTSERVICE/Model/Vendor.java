package Template.surge.com.RESTSERVICE.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vendor {
	
	@Id
	private int vendorId;
	
	private String vendorName;
	private String vendorLastName;
	private int vendorPone;
	private String vendorAdress;
	public int getVendorId() {
		return vendorId;
	}
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getVendorLastName() {
		return vendorLastName;
	}
	public void setVendorLastName(String vendorLastName) {
		this.vendorLastName = vendorLastName;
	}
	public int getVendorPone() {
		return vendorPone;
	}
	public void setVendorPone(int vendorPone) {
		this.vendorPone = vendorPone;
	}
	public String getVendorAdress() {
		return vendorAdress;
	}
	public void setVendorAdress(String vendorAdress) {
		this.vendorAdress = vendorAdress;
	}
	@Override
	public String toString() {
		return "Vendor [vendorId=" + vendorId + ", vendorName=" + vendorName + ", vendorLastName=" + vendorLastName
				+ ", vendorPone=" + vendorPone + ", vendorAdress=" + vendorAdress + "]";
	}
	
	
	
	
}
