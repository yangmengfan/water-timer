package cn.myproject.service.impl;

import cn.myproject.entity.Formmain1116;
import cn.myproject.mapper.Formmain1116Mapper;
import cn.myproject.service.IFormmain1116Service;
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
* @since 2020-01-15
*/
@Service
public class Formmain1116ServiceImpl extends ServiceImpl<Formmain1116Mapper, Formmain1116> implements IFormmain1116Service {
    @Autowired
    Formmain1116Mapper formmain1116Mapper;

    @Override
    public boolean save(Formmain1116 formmain1116){
        return this.save(formmain1116);
    }

    @Override
    public boolean deleteById(String id){
        if(StringUtils.isEmpty(id)){
            return false;
        }
        return this.removeById(id);
    }

    @Override
    public boolean updateById(Formmain1116 formmain1116){
        return this.updateById(formmain1116);
    }

    @Override
    public Formmain1116 selectById(String id){
        if(StringUtils.isEmpty(id)){
            return null;
        }
        return this.getById(id);
    }

    @Override
    public IPage<Formmain1116> queryPage(Page page, Formmain1116 formmain1116){
        QueryWrapper<Formmain1116> queryWrapper = new QueryWrapper<>();

        return this.page(page, queryWrapper);
    }
}

