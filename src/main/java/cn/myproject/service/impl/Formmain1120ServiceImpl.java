package cn.myproject.service.impl;

import cn.myproject.entity.Formmain1120;
import cn.myproject.mapper.Formmain1120Mapper;
import cn.myproject.service.IFormmain1120Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
/**
* <p>
*  服务实现类
* </p>
*
* @author yangmf
* @since 2020-01-14
*/
@Service
public class Formmain1120ServiceImpl extends ServiceImpl<Formmain1120Mapper, Formmain1120> implements IFormmain1120Service {
    @Autowired
    Formmain1120Mapper formmain1120Mapper;

    @Override
    public boolean save(Formmain1120 formmain1120){
        return this.save(formmain1120);
    }

    @Override
    public boolean deleteById(String id){
        if(StringUtils.isEmpty(id)){
            return false;
        }
        return this.removeById(id);
    }

    @Override
    public boolean updateById(Formmain1120 formmain1120){
        return this.updateById(formmain1120);
    }

    @Override
    public Formmain1120 selectById(String id){
        if(StringUtils.isEmpty(id)){
            return null;
        }
        return this.getById(id);
    }

    @Override
    public IPage<Formmain1120> queryPage(Page page, Formmain1120 formmain1120){
        QueryWrapper<Formmain1120> queryWrapper = new QueryWrapper<>();

        return this.page(page, queryWrapper);
    }
}

