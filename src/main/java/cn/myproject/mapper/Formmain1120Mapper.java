package cn.myproject.mapper;

import cn.myproject.entity.Formmain1120;
import cn.myproject.entity.Waterfb;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yangmf
 * @since 2020-01-14
 */
public interface Formmain1120Mapper extends BaseMapper<Formmain1120> {
    public void batchInsert(List<Formmain1120> list);

}
