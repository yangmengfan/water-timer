package cn.myproject.mapper;

import cn.myproject.entity.Waterfb;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yangmf
 * @since 2020-01-09
 */
public interface WaterfbMapper extends BaseMapper<Waterfb> {
    public void batchInsert(List<Waterfb> list);
}
