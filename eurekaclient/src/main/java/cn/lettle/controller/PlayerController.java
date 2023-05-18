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
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
        boolean flag1 = playerService.save(p);
        if(flag1) {
            return Result.ok(p.getId());
        } else {
            return Result.build(400,"ID重复");
        }
    }

    @PutMapping("/update")
    public Result updatePerson(@RequestBody Player p) {
        boolean flag = playerService.updateById(p);
        if(flag) {
            return Result.ok();
        } else {
            return Result.build(400,"update failed");
        }
    }

    @DeleteMapping("/delete")
    public Result deletePersonById(@RequestBody int id) {
        boolean flag1 = playerService.removeById(id);
        if(flag1) {
            return Result.ok();
        } else {
            return Result.build(400,"delete failed");
        }
    }

}
