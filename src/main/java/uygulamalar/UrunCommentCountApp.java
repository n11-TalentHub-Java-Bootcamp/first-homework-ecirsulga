package uygulamalar;

import dto.UrunYorumSayisiDto;
import entityservice.UrunYorumEntityService;

import java.util.List;

public class UrunCommentCountApp {

    public static void main(String[] args) {
        UrunYorumEntityService urunYorumEntityService = new UrunYorumEntityService();
        List<UrunYorumSayisiDto> urunYorumSayisi = urunYorumEntityService.getUrunCount();

        
        System.out.println("Ödev 3. Madde:" + urunYorumSayisi);
    }
}
