/**
 * @Author: Lettle
 * @Create: 2023-05-17 17:37
 * @Description: 玩家类
 **/
package cn.lettle.entity;


import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@TableName("player")
public class Player {

    @TableId(value="playerId", type = IdType.AUTO)
    int id;

    String username;
    String password;

    boolean isOnline;
    boolean isBanned;

    String email;
    @TableField("serverId")
    int serverId;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @TableField(fill = FieldFill.INSERT)
    Date lastLoginTime;

}
