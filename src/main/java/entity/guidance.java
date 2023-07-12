package entity;

import lombok.Data;

//技术指导表
@Data
public class guidance {
    //编号
    private Integer gid;
    //授课编号
    private Integer ccid;
    //学员编号
    private Integer userid;
    //教练编号
    private Integer useridt;
    //问题内容
    private String gquestion;
    //提出时间
    private String gquetime;
    //回复状态
    private String grepsta;
    //回复内容
    private String greply;
    //回复时间
    private String greptime;
}
