
package insan_kaynaklari_sistemi.POJO;

/**
 *
 * @author parthenia
 */
public class YetkiliPojo {
    
    private int yetkiliID;
    private String yetkiliAdi;
    private String yetkiliSoyadi;
    private String kullaniciAdi;
    private String sifre;
    private String departmanNo;
    private String unvani;
    private String telefon;

    public YetkiliPojo(int yetkiliID, String yetkiliAdi, String yetkiliSoyadi, String kullaniciAdi, String sifre, String departmanNo, String unvani, String telefon) {
        this.yetkiliID = yetkiliID;
        this.yetkiliAdi = yetkiliAdi;
        this.yetkiliSoyadi = yetkiliSoyadi;
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
        this.departmanNo = departmanNo;
        this.unvani = unvani;
        this.telefon = telefon;
    }

    
    public int getYetkiliID() {
        return yetkiliID;
    }

    public void setYetkiliID(int yetkiliID) {
        this.yetkiliID = yetkiliID;
    }

    public String getYetkiliAdi() {
        return yetkiliAdi;
    }

    public void setYetkiliAdi(String yetkiliAdi) {
        this.yetkiliAdi = yetkiliAdi;
    }

    public String getYetkiliSoyadi() {
        return yetkiliSoyadi;
    }

    public void setYetkiliSoyadi(String yetkiliSoyadi) {
        this.yetkiliSoyadi = yetkiliSoyadi;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getDepartmanNo() {
        return departmanNo;
    }

    public void setDepartmanNo(String departmanNo) {
        this.departmanNo = departmanNo;
    }

    public String getUnvani() {
        return unvani;
    }

    public void setUnvani(String unvani) {
        this.unvani = unvani;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    
    
}
