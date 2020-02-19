package wang.tyrael.ipcenter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wang.tyrael.ipcenter.data.Ip;

/**
 * @author: wangchao
 * 2018/8/17 0017
 */
@RestController    // This means that this class is a Controller
@RequestMapping(path="/ip") // This means URL's start
public class IpController {
    @Autowired
    private IpReposity ipReposity;

    @PostMapping
    public void insert(Ip ip){
        ipReposity.save(ip);
    }
}
