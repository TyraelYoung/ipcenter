package wang.tyrael.ipcenter;

import org.springframework.data.repository.CrudRepository;
import wang.tyrael.ipcenter.data.Ip;

/**
 * @author: wangchao
 * 2018/8/17 0017
 */
public interface IpReposity extends CrudRepository<Ip, String> {
}
