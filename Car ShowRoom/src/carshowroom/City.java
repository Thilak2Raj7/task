package carshowroom;

public class City {

	int availableStock;
	int soldStock;
	String cityName;
    String firstSoldCity;
    String recentSoldCity;
	public int getAvailableStock() {
		return availableStock;
	}
	public void setAvailableStock(int availableStock) {
		this.availableStock = availableStock;
	}
	public int getSoldStock() {
		return soldStock;
	}
	public void setSoldStock(int soldStock) {
		this.soldStock = soldStock;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getFirstSoldCity() {
		return firstSoldCity;
	}
	public void setFirstSoldCity(String firstSoldCity) {
		this.firstSoldCity = firstSoldCity;
	}
	public String getRecentSoldCity() {
		return recentSoldCity;
	}
	public void setRecentSoldCity(String recentSoldCity) {
		this.recentSoldCity = recentSoldCity;
	}
    
}
