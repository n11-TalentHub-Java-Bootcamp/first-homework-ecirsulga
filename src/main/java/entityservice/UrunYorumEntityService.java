package entityservice;

import dao.UrunYorumDao;
import dto.UrunYorumSayisiDto;
import dto.UrunYorumlarDto;
import entity.UrunYorum;
import java.util.List;

public class UrunYorumEntityService {

    private UrunYorumDao urunYorumDao;

    public UrunYorumEntityService() {
        urunYorumDao = new UrunYorumDao();
    }

    public List<UrunYorum> findAll(){
        return urunYorumDao.findAll();
    }

    public UrunYorum findById(long id)
    {
        return urunYorumDao.findById(id);
    }

    public List<UrunYorumlarDto> getUrunComments(Long urunID) {
        return urunYorumDao.getUrunComments(urunID);
    }

    public List<UrunYorum> deneme(Long urunId){ return urunYorumDao.deneme(urunId);}

    public List<UrunYorumSayisiDto> getUrunCount()
    {
        return urunYorumDao.getUrunCount();
    }

}
