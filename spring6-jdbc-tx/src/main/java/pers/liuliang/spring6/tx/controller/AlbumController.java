package pers.liuliang.spring6.tx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pers.liuliang.spring6.tx.service.AlbumService;

@Controller
public class AlbumController {
    @Autowired
    private AlbumService albumService;

    public void addAlbum(String name, Long partnerId, String companyName) {
        albumService.addAlbum(name, partnerId, companyName);
    }
}
