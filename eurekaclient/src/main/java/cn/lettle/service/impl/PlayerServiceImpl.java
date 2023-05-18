/**
 * @Author: Lettle
 * @Create: 2023-05-17 21:48
 * @Description:
 **/
package cn.lettle.service.impl;

import cn.lettle.entity.Player;
import cn.lettle.mapper.PlayerMapper;
import cn.lettle.service.PlayerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class PlayerServiceImpl extends ServiceImpl<PlayerMapper, Player> implements PlayerService {
}
