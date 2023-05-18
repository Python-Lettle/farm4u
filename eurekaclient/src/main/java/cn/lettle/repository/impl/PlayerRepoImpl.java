/**
 * @Author: Lettle
 * @Create: 2023-05-17 20:29
 * @Description:
 **/
package cn.lettle.repository.impl;

import cn.lettle.entity.Player;
import cn.lettle.repository.PlayerRepo;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class PlayerRepoImpl implements PlayerRepo {

    @Override
    public Collection<Player> findAll() {
        return null;
    }
}
