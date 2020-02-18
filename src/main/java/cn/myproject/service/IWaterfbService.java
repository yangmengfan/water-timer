package cn.myproject.service;

import cn.myproject.entity.Waterfb;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.util.List;

/**
* <p>
*  服务类
* </p>
*
* @author yangmf
* @since 2020-01-09
*/

public interface IWaterfbService extends IService<Waterfb> {

    public boolean save(Waterfb waterfb);

    public boolean deleteById(String id);

    public boolean updateById(Waterfb waterfb);

    public Waterfb selectById(String id);

    public IPage<Waterfb> queryPage(Page page, Waterfb Waterfb);

    public void batchInsert(List<Waterfb> list);

}

