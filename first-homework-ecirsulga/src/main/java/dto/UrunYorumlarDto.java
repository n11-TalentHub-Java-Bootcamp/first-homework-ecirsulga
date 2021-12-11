package dto;

import java.math.BigDecimal;
import java.util.Date;

public class UrunYorumlarDto {

    private String urunAdi;
    private String kategoriAdi;
    private BigDecimal urunFiyat;
    private String kullaniciAdi;
    private String kullaniciSoyadi;
    private String kullaniciEmail;
    private String kullaniciTelefon;
    private String urunYorum;
    private Date yorumTarihi;

    public UrunYorumlarDto(String urunAdi, String kategoriAdi, BigDecimal urunFiyat, String kullaniciAdi, String kullaniciSoyadi, String kullaniciEmail, String kullaniciTelefon, String urunYorum, Date yorumTarihi) {
        this.urunAdi = urunAdi;
        this.kategoriAdi = kategoriAdi;
        this.urunFiyat = urunFiyat;
        this.kullaniciAdi = kullaniciAdi;
        this.kullaniciSoyadi = kullaniciSoyadi;
        this.kullaniciEmail = kullaniciEmail;
        this.kullaniciTelefon = kullaniciTelefon;
        this.urunYorum = urunYorum;
        this.yorumTarihi = yorumTarihi;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public String getKategoriAdi() {
        return kategoriAdi;
    }

    public void setKategoriAdi(String kategoriAdi) {
        this.kategoriAdi = kategoriAdi;
    }

    public BigDecimal getUrunFiyat() {
        return urunFiyat;
    }

    public void setUrunFiyat(BigDecimal urunFiyat) {
        this.urunFiyat = urunFiyat;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getKullaniciSoyadi() {
        return kullaniciSoyadi;
    }

    public void setKullaniciSoyadi(String kullaniciSoyadi) {
        this.kullaniciSoyadi = kullaniciSoyadi;
    }

    public String getKullaniciEmail() {
        return kullaniciEmail;
    }

    public void setKullaniciEmail(String kullaniciEmail) {
        this.kullaniciEmail = kullaniciEmail;
    }

    public String getUrunYorum() {
        return urunYorum;
    }

    public void setUrunYorum(String urunYorum) {
        this.urunYorum = urunYorum;
    }

    public Date getYorumTarihi() {
        return yorumTarihi;
    }

    public void setYorumTarihi(Date yorumTarihi) {
        this.yorumTarihi = yorumTarihi;
    }

    @Override
    public String toString() {
        return "UrunYorumForKullaniciDto{" +
                "urunAdi='" + urunAdi + '\'' +
                ", kategoriAdi='" + kategoriAdi + '\'' +
                ", urunFiyat=" + urunFiyat +
                ", kullaniciAdi='" + kullaniciAdi + '\'' +
                ", kullaniciSoyadi='" + kullaniciSoyadi + '\'' +
                ", kullaniciEmail='" + kullaniciEmail + '\'' +
                ", urunYorum='" + urunYorum + '\'' +
                ", yorumTarihi=" + yorumTarihi +
                '}';
    }
}
