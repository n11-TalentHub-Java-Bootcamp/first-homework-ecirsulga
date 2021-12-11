package dao;

import base.BaseDao;
import dto.UrunYorumSayisiDto;
import dto.UrunYorumlarDto;
import entity.UrunYorum;
import org.hibernate.query.Query;

import java.util.List;

public class UrunYorumDao extends BaseDao {

    public List<UrunYorum> findAll(){

        Query query = getCurrentSession().createQuery(
                "select urunyorum from UrunYorum urunyorum");

        return query.list();
    }

    public UrunYorum findById(Long id){

        String sql = "select urunyorum from UrunYorum urunyorum where urunyorum.id = :givenId";

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("givenId", id);

        return (UrunYorum) query.uniqueResult();
    }

    public List<UrunYorumlarDto> getUrunComments(Long urunId)
    {
        String sql = "select new dto.UrunYorumlarDto( urun.adi, urun.kategori.adi, urun.fiyat, urunyorum.kullanici.adi, urunyorum.kullanici.soyadi, urunyorum.kullanici.email, urunyorum.kullanici.telefon, urunyorum.yorum, urunyorum.yorumTarihi ) " +
                "from UrunYorum urunyorum " +
                "left join Urun urun on urunyorum.urun.id = urun.id " +
                "where urun.id = :givenId";

        //SELECT * from URUNYORUM inner join KULLANICI on URUNYORUM.id_kullanici = KULLANICI.id inner join URUN on URUNYORUM.id_urun = URUN.id
        //inner join KATEGORI on URUN.id_kategori = KATEGORI.id where urun.id = 4

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("givenId", urunId);

        return query.list();
    }

    public List<UrunYorum> deneme(Long urunId)
    {
        String sql = "select urunyorum " +
                "from UrunYorum urunyorum " +
                "inner join Urun urun on urunyorum.urun.id = urun.id " +
                "where urun.id = :givenId";

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("givenId", urunId);

        return query.list();
    }

    public List<UrunYorumSayisiDto> getUrunCount()
    {
        String sql = "select new dto.UrunYorumSayisiDto( urun.id, urun.adi, urun.fiyat, Count(ID_URUN) )" +
                "from Urun urun " +
                "left join UrunYorum urunyorum on urunyorum.urun.id = urun.id " +
                "group by urun.id,urun.adi,urun.fiyat order by urun.id";

        //SELECT u.id,u.adi,u.fiyat,Count(uy.id_urun)
        //	FROM public.urun as u left join public.urunyorum as uy ON  u.id = uy.id_urun group by u.id,u.adi,u.fiyat order by u.id

        Query query = getCurrentSession().createQuery(sql);
        return query.list();
    }

}
