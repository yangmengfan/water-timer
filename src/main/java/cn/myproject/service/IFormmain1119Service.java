package cn.myproject.service;

import cn.myproject.entity.Formmain1119;
import com.baomidou.mybatisplus.extension.service.IService;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.util.List;

/**
* <p>
*  服务类
* </p>
*
* @author yangmf
* @since 2020-01-10
*/

public interface IFormmain1119Service extends IService<Formmain1119> {

    public boolean save(Formmain1119 formmain1119);

    public boolean deleteById(String id);

    public boolean updateById(Formmain1119 formmain1119);

    public Formmain1119 selectById(String id);

    public List<Formmain1119> queryPage( Formmain1119 Formmain1119);

}

