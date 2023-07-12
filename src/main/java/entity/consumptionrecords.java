package entity;

import lombok.Data;

//消费记录表
@Data
public class consumptionrecords {
    //编号
    private Integer crid;
    //学员编号
    private Integer userid;
    //学员上课编号
    private Integer said;
    //消费时间
    private String crtime;
    //消费金额
    private float cramount;

}
