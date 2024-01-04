package hi;

public class ogrenci {
	 String isim;
		int numara;
	double kilo;
	
	
	void ogr(String isim,int numara,double kilo){
		
		
		this.isim=isim;
		this.numara= numara;
		this.kilo=kilo;
		
		
		
	}
	
	private String ogrenciNU;
	private String ad,soyad;
	private char cinsiyet;
	
	public void ogreci(String p_numara) {
		
		ogrenciNU = p_numara;
		
		
	}
	
	public void setOgrenciNu(String p_nu) {
	ogrenciNU = p_nu;
		
		
	}
	
	public String getOgrenciNU(){
		
		return ogrenciNU;
		
	}
	

}
