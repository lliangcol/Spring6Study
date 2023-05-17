package pers.liuliang.spring6.tx;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import pers.liuliang.spring6.tx.controller.AlbumController;

@SpringJUnitConfig(locations = "classpath:beans.xml")
public class TestAlbumTx {
    @Autowired
    private AlbumController albumController;

    @Test
    public void addAlbumTest() {

    }
}
