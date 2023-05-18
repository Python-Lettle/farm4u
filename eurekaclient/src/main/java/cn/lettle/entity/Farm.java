/**
 * @Author: Lettle
 * @Create: 2023-05-17 21:39
 * @Description:
 **/
package cn.lettle.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@TableName("player_farm")
public class Farm {
    int farmx;
    int farmy;
    int playerId;
    int farmLevel;
}
