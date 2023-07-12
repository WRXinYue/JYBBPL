package entity;

import lombok.Data;

//学员上课表
@Data
public class studentac {
    //编号
    private Integer said;
    //授课编号
    private Integer ccid;
    //前台编号
    private Integer useridf;
    //到店状态
    private String sastate;
    //到店时间
    private String satime;
    //学员编号
    private Integer userid;
    //学员上课状态
    private String saclassstatus;
    //上课时间
    private String saattendtime;

}
