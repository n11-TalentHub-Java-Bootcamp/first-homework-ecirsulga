package dto;

import java.math.BigDecimal;

public class UrunYorumSayisiDto {
    private Long urunId;
    private String urunAdi;
    private BigDecimal urunFiyat;
    private Long yorumSayisi;

    public UrunYorumSayisiDto(Long urunId, String urunAdi, BigDecimal urunFiyat, Long yorumSayisi) {
        this.urunId = urunId;
        this.urunAdi = urunAdi;
        this.urunFiyat = urunFiyat;
        this.yorumSayisi = yorumSayisi;
    }

    @Override
    public String toString() {
        return "UrunYorumSayisiDto{" +
                "urunId=" + urunId +
                ", urunAdi='" + urunAdi + '\'' +
                ", urunFiyat=" + urunFiyat +
                ", yorumSayisi=" + yorumSayisi +
                '}';
    }

    public Long getUrunId() {
        return urunId;
    }

    public void setUrunId(Long urunId) {
        this.urunId = urunId;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public BigDecimal getUrunFiyat() {
        return urunFiyat;
    }

    public void setUrunFiyat(BigDecimal urunFiyat) {
        this.urunFiyat = urunFiyat;
    }

    public Long getYorumSayisi() {
        return yorumSayisi;
    }

    public void setYorumSayisi(Long yorumSayisi) {
        this.yorumSayisi = yorumSayisi;
    }
}
