package org.example;

import java.util.List;

/**
 * @Auther : https://www.baidu.com
 */
public interface UsersMapper {

    void insertUser(Users users);

    List<Users> selectUserAll();
}
