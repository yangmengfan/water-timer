package cn.myproject.service.impl;

import cn.myproject.entity.Formmain1119;
import cn.myproject.mapper.Formmain1119Mapper;
import cn.myproject.service.IFormmain1119Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
* <p>
*  服务实现类
* </p>
*
* @author yangmf
* @since 2020-01-10
*/
@Service
public class Formmain1119ServiceImpl extends ServiceImpl<Formmain1119Mapper, Formmain1119> implements IFormmain1119Service {
    @Autowired
    Formmain1119Mapper formmain1119Mapper;

    @Override
    public boolean save(Formmain1119 formmain1119){
        return formmain1119Mapper.insert(formmain1119)>0? true: false;
    }

    @Override
    public boolean deleteById(String id){
        if(StringUtils.isEmpty(id)){
            return false;
        }
        return this.removeById(id);
    }

    @Override
    public boolean updateById(Formmain1119 formmain1119){
        return formmain1119Mapper.updateById(formmain1119)>0? true: false;
    }

    @Override
    public Formmain1119 selectById(String id){
        if(StringUtils.isEmpty(id)){
            return null;
        }
        return this.getById(id);
    }

    @Override
    public List<Formmain1119> queryPage(Formmain1119 formmain1119){
        QueryWrapper<Formmain1119> queryWrapper = new QueryWrapper<>();
        if (StringUtils.hasText(formmain1119.getField0001())){
            queryWrapper.eq("field0001",formmain1119.getField0001());
        }
        if (StringUtils.hasText(formmain1119.getField0002())){
            queryWrapper.eq("field0002",formmain1119.getField0002());
        }
        if (StringUtils.hasText(formmain1119.getField0003())){
            queryWrapper.eq("field0003",formmain1119.getField0003());
        }
        return formmain1119Mapper.selectList(queryWrapper);
    }
}

