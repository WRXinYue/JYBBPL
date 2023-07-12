package exception;

/**
 * 自定义异常,使用ServiceException避免系统错误和程序错误发生混淆
 */
public class ServiceException extends RuntimeException {

    public ServiceException(String message) {
        super(message);
    }

}
