package pers.liuliang.spring6.jdbc.model;

import java.util.Date;

public class Album {
    private Long id;
    private String name;
    private Long partner_id;
    private String partner_name;
    private Date create_date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPartner_id() {
        return partner_id;
    }

    public void setPartner_id(Long partner_id) {
        this.partner_id = partner_id;
    }

    public String getPartner_name() {
        return partner_name;
    }

    public void setPartner_name(String partner_name) {
        this.partner_name = partner_name;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    @Override
    public String toString() {
        return "Album{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", partner_id=" + partner_id +
                ", partner_name='" + partner_name + '\'' +
                ", create_date=" + create_date +
                '}';
    }
}
