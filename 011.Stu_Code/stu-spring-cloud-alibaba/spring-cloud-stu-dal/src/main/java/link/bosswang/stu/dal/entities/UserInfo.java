package link.bosswang.stu.dal.entities;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserInfo implements Serializable {
    private String userId;
    private String userName;
    private String age;

    public UserInfo() {
    }

    public UserInfo(String userId, String userName, String age) {
        this.userId = userId;
        this.userName = userName;
        this.age = age;
    }
}
