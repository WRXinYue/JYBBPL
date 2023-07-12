package common;

import lombok.Data;

/**
 * 返回前端所有的属性
 */
@Data
public class Result {
    private static final String SUCCESS_CODE = "200";
    private static final String ERROR_CODE = "-1";

    private String code;    // 响应结果实现
    private Object data;    // 存放返回结果
    private String msg;     // 存放错误信息

    /**
     * 返回成功信息
     * @return
     */
    public static Result success() {
        Result result = new Result();
        result.setCode(SUCCESS_CODE);
        return  result;
    }

    /**
     * 返回成功信息和对象结果
     * @param data
     * @return
     */
    public static Result success(Object data) {
        Result result = new Result();
        result.setCode(SUCCESS_CODE);
        result.setData(data);
        return result;
    }

    /**
     * 返回错误信息和错误提醒
     * @param msg
     * @return
     */
    public static Result error(String msg) {
        Result result = new Result();
        result.setCode(ERROR_CODE);
        result.setMsg(msg);
        return result;
    }

}
