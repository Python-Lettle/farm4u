/**
 * @Author: Lettle
 * @Create: 2023-05-17 21:49
 * @Description:
 **/
package cn.lettle.mapper;

import cn.lettle.entity.Player;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PlayerMapper extends BaseMapper<Player> {
}
