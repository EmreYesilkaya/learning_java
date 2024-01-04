package hi;

public class daire {
	
	
	private int pi=3;
	private double yaricap;
	
	
	public void set_yaricap(double yaricap) {
		
		this.yaricap=yaricap;
		
	}
	
	public double get_yaricap() {
		
		return yaricap;
		
	}
	
	public void alanHesapla() {
		
		System.out.println("alan hesapı = "+ pi*yaricap*yaricap);
	}
	
	
}
