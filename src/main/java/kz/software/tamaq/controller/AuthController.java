package kz.software.tamaq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Nurs Tech
 * @project Tamaq;
 */

@Controller
@RequestMapping("/login")
public class AuthController {

  @GetMapping
  public String loginPage() {
    return "signIn";
  }

}