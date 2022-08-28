package link.bosswang.stu.controller;

import link.bosswang.stu.api.response.Response;
import link.bosswang.stu.dal.entities.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @RequestMapping(value = "/getUserInfo", method = RequestMethod.GET)
    @ResponseBody
    public Response<UserInfo> getUserInfo(@RequestParam("userId") String userId) {
        System.out.println("获取用户信息:" + userId);
        return Response.success(new UserInfo(userId, "UserName:" + userId, "UserAge: " + userId));
    }
}
