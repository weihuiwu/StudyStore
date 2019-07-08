package hello.controller;

import hello.entity.User;
import hello.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/getUsers")
    public List<User> getUsers() {
        List<User> users = userMapper.getAll();
        return users;
    }

    @RequestMapping(value = "/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        int rows = userMapper.delete(id);
        if(rows>0){
            return "删除ID为"+id+"的用户成功";
        }
        return "删除失败";

    }

    @RequestMapping("/getList")
    public List<User> getList() {
        List<User> users = userMapper.getUsers();
        return users;
    }

}