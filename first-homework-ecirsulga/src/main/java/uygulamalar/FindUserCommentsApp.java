package uygulamalar;

import dto.KullaniciYorumlarDto;
import entityservice.KullaniciEntityService;

import java.util.List;

public class FindUserCommentsApp {

    public static void main(String[] args) {
        KullaniciEntityService kullaniciEntityService = new KullaniciEntityService();
        List<KullaniciYorumlarDto> kullaniciYorumlari = kullaniciEntityService.getAllKullaniciYorum(5L);

        System.out.println("Ödev 4. Madde:" + kullaniciYorumlari);
    }
}
