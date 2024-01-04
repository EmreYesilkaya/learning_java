package hi;

public class araba {

    private String marka1;
    private String model;
    private int yil;
    private String yilStr; // String olarak yıl değeri

    public void setMarka(String marka) {
        marka1 = marka;
    }

    public String getMarka() {
        return marka1;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    // int türünde yıl ayarlayan metod
    public void setYil(int yil) {
        this.yil = yil;
    }

    // String türünde yıl ayarlayan metod
    public void setYil(String yilStr) {
        this.yilStr = yilStr;
    }

    // int türünde yıl döndüren metod
    public int getYil() {
        return yil;
    }

    // String türünde yıl döndüren metod
    public String getYilStr() {
        return yilStr;
    }
}
