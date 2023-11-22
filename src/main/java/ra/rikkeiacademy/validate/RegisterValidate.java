package ra.rikkeiacademy.validate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import ra.rikkeiacademy.dto.RegisterForm;
import ra.rikkeiacademy.dto.SignInForm;
import ra.rikkeiacademy.service.UserService;

import java.time.LocalDateTime;
@Component
public class RegisterValidate implements Validator {
    @Autowired
    private UserService userService ;

    @Override
    public boolean supports(Class<?> clazz) {
        return RegisterForm.class.equals(clazz);
    }

    @Override
    public void validate(Object object, Errors errors) {
        RegisterForm RV = (RegisterForm) object;
        if (!userService.register(RV)){
            errors.rejectValue("username","username","tên tài khoản đã tồn tại");
        }
        if(!RV.getPassword().equals(RV.getRePassword())){
            errors.rejectValue("repPassword","username","mật khẫu nhập lại không trùng lặp");
        }
    }
}
