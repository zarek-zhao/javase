public class UserService {

    public void register(String username,String password,User user) throws MyStringException {
        if(username.length() > 14 || username.length() < 6){
            throw new MyStringException("用户名长度要求在指定范围内[6-14]");
        }
        user.setUsername(username);
        user.setPassword(password);
    }
}
