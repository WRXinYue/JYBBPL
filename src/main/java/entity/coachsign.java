package entity;

import lombok.Data;

//教练签到表
@Data
public class coachsign {
    //编号
    private Integer sid;
    //课程编号
    private Integer scouid;
    //前台编号
    private Integer srecid;
    //前台签到状态
    private String srstats;
    //前台打卡时间
    private String srtime;
    //教练编号
    private Integer scoaid;
    //教练授课状态
    private String scoastats;
    //授课时间
    private String scoatime;

}
