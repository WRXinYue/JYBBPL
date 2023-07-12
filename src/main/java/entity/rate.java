package entity;

import lombok.Data;

//评价表
@Data
public class rate {
    //编号
    private Integer rateid;
    //授课表编号
    private Integer ccid;
    //学员编号
    private Integer userid;
    //教练编号
    private Integer useridt;
    //评价等级
    private Integer ratelevel;
    //评价时间
    private String ratetime;
}
