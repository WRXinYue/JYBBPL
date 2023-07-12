package entity;

import lombok.Data;

//授课表
@Data
public class coachcourse {
    //编号
    private Integer ccid;
    //课程编号
    private Integer ucid;
    //前台编号
    private Integer ccattendtime;
    //前台签到状态
    private String ccendtime;
    //前台打卡时间
    private String ccreateid;
    //教练编号
    private Integer useridt;
    //是否开始
    private String ccheckstart;
}
