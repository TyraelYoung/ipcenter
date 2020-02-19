package wang.tyrael.ipcenter.data;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/**
 * @author: wangchao
 * 2018/8/17 0017
 */
@Entity
public class Ip {
    @Id
    @GeneratedValue(generator = "uuid")   //指定生成器名称
    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")  //生成器名称，uuid生成类
    public String id;

    public String ip;
    public Timestamp requestTime = new Timestamp(System.currentTimeMillis());
    public String domain;
    public String path;

    public Timestamp createAt = new Timestamp(System.currentTimeMillis());
    @Column(columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    public Timestamp updateAt;

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
