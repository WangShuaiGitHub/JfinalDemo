package com.demo.blog;

import com.demo.common.model.User;

import java.util.List;

/**
 * @author wangs-as
 * @date 10/13/2020 6:09 PM
 */
public class UserService {
    private User dao = new User().dao();

    public List<User> getAll() {
        return dao.findAll();
    }
}
