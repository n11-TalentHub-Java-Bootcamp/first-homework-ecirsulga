package uygulamalar;

import dto.UrunYorumlarDto;
import entityservice.UrunYorumEntityService;

import java.util.List;

public class FindCommentsByUrunApp {

    public static void main(String[] args) {
        UrunYorumEntityService urunYorumEntityService = new UrunYorumEntityService();
        List<UrunYorumlarDto> urunYorumlari = urunYorumEntityService.getUrunComments(4L);


        System.out.println("Ödev 2. Madde:" + urunYorumlari);
    }

}
