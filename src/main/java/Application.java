import dto.KullaniciYorumlarDto;
import dto.UrunYorumSayisiDto;
import dto.UrunYorumlarDto;
import entity.Urun;
import entity.UrunYorum;
import entityservice.KullaniciEntityService;
import entityservice.UrunEntityService;
import entityservice.UrunYorumEntityService;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        UrunYorumEntityService urunYorumEntityService = new UrunYorumEntityService();
        KullaniciEntityService kullaniciEntityService = new KullaniciEntityService();
        /*List<UrunYorum>  urunYorumList = urunYorumEntityService.findAll();
        System.out.println(urunYorumList);

        UrunEntityService urunEntityService = new UrunEntityService();
        Urun  urun = urunEntityService.findById(2L);
        System.out.println(urun);
        System.out.println(urunEntityService.findAllUrunByKategoriKirilim(2L));
        UrunYorum  urunYorum = urunYorumEntityService.findById(2L);
        System.out.println(urunYorum);*/
        //List<UrunYorum> a = urunYorumEntityService.deneme(2L);

        List<UrunYorumlarDto> urunYorumlari = urunYorumEntityService.getUrunComments(4L);
        System.out.println("2. Madde:" + urunYorumlari);

        List<UrunYorumSayisiDto> urunYorumSayisi = urunYorumEntityService.getUrunCount();
        System.out.println("3. Madde:" + urunYorumSayisi);

        List<KullaniciYorumlarDto> kullaniciYorumlari = kullaniciEntityService.getAllKullaniciYorum(5L);
        System.out.println("4. Madde:" + kullaniciYorumlari);


    }
}
