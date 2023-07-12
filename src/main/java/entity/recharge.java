package entity;

import lombok.Data;

//充值表
@Data
public class recharge {
    //编号
    private Integer reid;
    //学员编号
    private Integer userid;
    //操作人编号
    private Integer userida;
    //充值时间
    private String retime;
    //充值金额
    private float reamo;

}
