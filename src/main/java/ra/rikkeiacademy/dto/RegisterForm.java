package ra.rikkeiacademy.dto;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import java.util.Date;

public class RegisterForm {
    private Long id;
    @NotBlank(message = "không được để trống")
    private String username , password , rePassword, avatar = "https://tse1.mm.bing.net/th?id=OIP.kgHfR7QfLo7eslChOTycpwHaFj&pid=Api&P=0&h=220"
            , fullName;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    public String message;

    public RegisterForm() {
    }

    public RegisterForm(Long id, String username, String password, String rePassword, String avatar, String fullName, Date birthday) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.rePassword = rePassword;
        this.avatar = avatar;
        this.fullName = fullName;
        this.birthday = birthday;

    }

    public String getMessage() {
        return message;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRePassword() {
        return rePassword;
    }

    public void setRePassword(String rePassword) {
        this.rePassword = rePassword;
    }
}
