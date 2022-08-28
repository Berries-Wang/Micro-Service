package link.bosswang.stu.api.response;

import lombok.Data;

import java.io.Serializable;

@Data
public class Response<T> implements Serializable {
    private int status;
    private String errCode;
    private String errMsg;
    private T data;


    public static <T> Response<T> success(T data) {
        Response<T> response = new Response<T>();
        response.setStatus(200);
        response.setErrCode("200");
        response.setErrMsg("SUCCESS");
        response.setData(data);

        return response;
    }
}
