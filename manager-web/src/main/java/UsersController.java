import org.example.Users;
import org.example.UsersMapper;
import org.example.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther : https://www.baidu.com
 */
@Controller
@RequestMapping("/user")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @RequestMapping("/addUser")
    public  String addUser(Users users){
        this.usersService.addUser(users);
        return "ok";
    }
}
