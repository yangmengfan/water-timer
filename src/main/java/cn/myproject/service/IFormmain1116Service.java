package cn.myproject.service;

import cn.myproject.entity.Formmain1116;
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
* @since 2020-01-15
*/

public interface IFormmain1116Service extends IService<Formmain1116> {

    public boolean save(Formmain1116 formmain1116);

    public boolean deleteById(String id);

    public boolean updateById(Formmain1116 formmain1116);

    public Formmain1116 selectById(String id);

    public IPage<Formmain1116> queryPage(Page page, Formmain1116 Formmain1116);

}

