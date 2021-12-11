package dao;

import base.BaseDao;
import dto.KullaniciYorumlarDto;
import entity.Kullanici;
import org.hibernate.query.Query;

import java.util.List;

public class KullaniciDao extends BaseDao {

    public List<Kullanici> findAll(){

        Query query = getCurrentSession().createQuery(
                "select kullanici from Kullanici kullanici");

        return query.list();
    }

    public List<KullaniciYorumlarDto> getAllKullaniciYorum(Long kullaniciId)
    {
        String sql = "select new dto.KullaniciYorumlarDto( kullanıcı.id, kullanıcı.adi, urunyorum.urun.adi, urunyorum.yorum, urunyorum.yorumTarihi ) " +
                        "from Kullanici kullanıcı " +
                        "left join UrunYorum urunyorum on urunyorum.kullanici.id = kullanıcı.id " +
                        "where kullanıcı.id = :givenId";

                Query query = getCurrentSession().createQuery(sql);
                query.setParameter("givenId", kullaniciId);

                return query.list();
        //KullaniciYorumlarDto(Long kullaniciId, String kullaniciAdi, String urunAdi, String yorum, Date yorumTarihi)
        //SELECT k.id, k.adi, uy.yorum ,uy.yorumtarihi
        //	FROM public.kullanici as k left join public.urunyorum as uy ON uy.id_kullanici = k.id
    }
}
