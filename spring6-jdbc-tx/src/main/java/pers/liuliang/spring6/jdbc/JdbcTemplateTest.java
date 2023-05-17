package pers.liuliang.spring6.jdbc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import pers.liuliang.spring6.jdbc.model.Album;

import java.util.Date;

@SpringJUnitConfig(locations = "classpath:beans.xml")
public class JdbcTemplateTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testUpdate() {
/*        String sql = "insert into album values(?,?,?,?,?)";
        int rows = jdbcTemplate.update(sql, 1, "test", 1000, "北京中文在线文化传媒有限公司", new Date());
        System.out.println(rows);*/

/*        String sql = "update album set name = ? where id = ?";
        int rows = jdbcTemplate.update(sql, "test2", 1);
        System.out.println(rows);*/

        String sql = "delete from album where id = ?";
        int rows = jdbcTemplate.update(sql, 1);
        System.out.println(rows);
    }

    @Test
    public void testSelectObject() {
/*        String sql = "select id, name, partner_id, partner_company_name, create_date from album where id = ?";
        Album album = jdbcTemplate.queryForObject(sql, (rs, rowNum) -> {
            Album album1 = new Album();
            album1.setId(rs.getLong("id"));
            album1.setName(rs.getString("name"));
            album1.setPartner_id(rs.getLong("partner_id"));
            album1.setPartner_name(rs.getString("partner_company_name"));
            album1.setCreate_date(rs.getDate("create_date"));
            return album1;
        }, 487698525485010944L);
        System.out.println(album);*/

        String sql = "select id, name, partner_id, partner_company_name, create_date from album where id = ?";
        Album album = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Album.class), 487698525485010944L);
        System.out.println(album);
    }

    @Test
    public void testSelectList() {
/*        String sql = "select id, name, partner_id, partner_company_name, create_date from album";
        jdbcTemplate.query(sql, rs -> {
            Album album = new Album();
            album.setId(rs.getLong("id"));
            album.setName(rs.getString("name"));
            album.setPartner_id(rs.getLong("partner_id"));
            album.setPartner_name(rs.getString("partner_company_name"));
            album.setCreate_date(rs.getDate("create_date"));
            System.out.println(album);
        });*/

        String sql = "select id, name, partner_id, partner_company_name, create_date from album";
        jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Album.class)).forEach(System.out::println);
    }

    @Test
    public void testSelectValue() {
        String sql = "select count(1) from album";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(count);
    }
}
