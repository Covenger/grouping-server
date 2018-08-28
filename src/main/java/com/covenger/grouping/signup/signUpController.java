package com.covenger.grouping.signup;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class signUpController {

    @RequestMapping(value = "/sign_up/check_email", method = RequestMethod.POST)
    public boolean checkEmail(String email) {
        System.out.print(email);
        return true;
    }

}
