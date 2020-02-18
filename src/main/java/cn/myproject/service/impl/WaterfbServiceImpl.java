package cn.myproject.service.impl;

import cn.myproject.entity.Waterfb;
import cn.myproject.mapper.WaterfbMapper;
import cn.myproject.service.IWaterfbService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.util.List;

/**
* <p>
*  服务实现类
* </p>
*
* @author yangmf
* @since 2020-01-09
*/
@Service("waterfbService")
@Transactional
public class WaterfbServiceImpl extends ServiceImpl<WaterfbMapper, Waterfb> implements IWaterfbService {
    @Autowired
    WaterfbMapper waterfbMapper;

    @Override
    public boolean save(Waterfb waterfb){

        return waterfbMapper.insert(waterfb) > 0? true: false;
    }

    @Override
    public boolean deleteById(String id){
        if(StringUtils.isEmpty(id)){
            return false;
        }
        return this.removeById(id);
    }

    @Override
    public boolean updateById(Waterfb waterfb){
        return this.updateById(waterfb);
    }

    @Override
    public Waterfb selectById(String id){
        if(StringUtils.isEmpty(id)){
            return null;
        }
        return this.getById(id);
    }

    @Override
    public IPage<Waterfb> queryPage(Page page, Waterfb waterfb){
        QueryWrapper<Waterfb> queryWrapper = new QueryWrapper<>();

        return this.page(page, queryWrapper);
    }

    @Override
    public void batchInsert(List<Waterfb> list) {
        for (Waterfb fb: list){
            this.save(fb);
        }
        //waterfbMapper.batchInsert(list);
    }
}

