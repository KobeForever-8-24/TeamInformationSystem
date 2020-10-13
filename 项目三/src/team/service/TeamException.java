package team.service;

/*
 * 自定义异常类
 * */

public class TeamException extends Exception {
    static final long serialVersionUID = -3387514229948L;

    public TeamException() {
        super();
    }

    public TeamException(String msg) {
        super(msg);
    }
}
