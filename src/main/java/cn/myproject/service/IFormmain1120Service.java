package cn.myproject.service;

import cn.myproject.entity.Formmain1120;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
/**
* <p>
*  服务类
* </p>
*
* @author yangmf
* @since 2020-01-14
*/

public interface IFormmain1120Service extends IService<Formmain1120> {

    public boolean save(Formmain1120 formmain1120);

    public boolean deleteById(String id);

    public boolean updateById(Formmain1120 formmain1120);

    public Formmain1120 selectById(String id);

    public IPage<Formmain1120> queryPage(Page page, Formmain1120 Formmain1120);

}

