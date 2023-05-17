package pers.liuliang.spring6.tx.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import pers.liuliang.spring6.tx.model.Album;

import java.util.Date;

@Repository
public class AlbumDaoImpl implements AlbumDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int addAlbum(String name, Long partnerId, String companyName) {
        String sql = "insert into album(id, name, partner_id, partner_company_name, create_date) values(?, ?, ?, ?, ?)";
        return jdbcTemplate.update(sql, 1, name, partnerId, companyName, new Date());
    }

    @Override
    public Album getAlbum(String name, Long partnerId) {
        String sql = "select id, name, partner_id, partner_company_name, create_date from album where name = ? and partner_id = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Album.class), name, partnerId);
    }
}
