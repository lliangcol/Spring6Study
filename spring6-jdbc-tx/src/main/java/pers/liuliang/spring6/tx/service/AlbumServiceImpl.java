package pers.liuliang.spring6.tx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.liuliang.spring6.tx.dao.AlbumDao;
import pers.liuliang.spring6.tx.model.Album;

@Service
public class AlbumServiceImpl implements AlbumService {
    @Autowired
    private AlbumDao albumDao;

    @Override
    public void addAlbum(String name, Long partnerId, String companyName) {
        Album album = albumDao.getAlbum(name, partnerId);
        if (album != null) {
            throw new RuntimeException("相册已存在");
        }
        int rows = albumDao.addAlbum(name, partnerId, companyName);
        if (rows != 1) {
            throw new RuntimeException("添加相册失败");
        }
    }
}
