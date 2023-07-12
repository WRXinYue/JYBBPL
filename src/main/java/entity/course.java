package entity;

import lombok.Data;

//课程表
@Data
public class course {
    //编号
    private Integer cid;
    //课程名
    private String cname;
    //项目编号
    private Integer pid;
    //教练编号
    private Integer useridt;
    //开课时间
    private String cstarttime;
    //上课时间
    private String cattendtime;
    //结束时间
    private String cendtime;
    //课时
    private Integer clesson;
    //课程描述
    private String cdescribe;
    //开课人数
    private Integer cpeonum;
    //已预约人数
    private Integer cactpeonum;
    //开课状态
    private String cstartstatus;
    //预约课程时间
    private String creservetime;
    //创建编号
    private Integer ccreateid;
    //创建时间
    private String ccreatetime;
}
