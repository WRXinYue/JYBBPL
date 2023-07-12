package entity;

import lombok.Data;

//课程预约表
@Data
public class coursereserve {
    //编号
    private Integer csid;
    //课程编号
    private Integer cid;
    //预约人编号
    private Integer ulid;
    //预约时间
    private String cappointment;
    //预约状态
    private String cappointmentstatus;
    //审批人编号
    private Integer ulida;
    //审批时间
    private String cprocessingtime;
    //否定原因
    private String cveto;

}
