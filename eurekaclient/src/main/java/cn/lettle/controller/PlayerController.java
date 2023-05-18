/**
 * @Author: Lettle
 * @Create: 2023-05-17 20:22
 * @Description:
 **/
package cn.lettle.controller;

import cn.lettle.entity.Player;
import cn.lettle.mapper.PlayerMapper;
import cn.lettle.service.PlayerService;
import cn.lettle.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/player")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @Autowired
    private PlayerMapper playerMapper;

    @GetMapping("/findAll")
    public List<Player> findAll() {
        return playerMapper.selectList(null);
    }

    @PostMapping("/register")
    public Result register(@RequestBody Player p) {

        return Result.ok();
    }

}
