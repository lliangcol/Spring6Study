package pers.liuliang.spring6.tx.dao;

import pers.liuliang.spring6.tx.model.Album;

public interface AlbumDao {
    int addAlbum(String name, Long partnerId, String companyName);

    Album getAlbum(String name, Long partnerId);
}
