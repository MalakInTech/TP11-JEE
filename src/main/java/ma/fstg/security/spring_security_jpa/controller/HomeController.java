package ma.fstg.security.spring_security_jpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

    @Controller
    public class HomeController {

        @GetMapping("/login")
        public String login() {
            return "login";
        }

        @GetMapping("/home")
        public String home() {
            return "home";
        }

        @GetMapping("/user")
        public String user() {
            return "user";
        }

        @GetMapping("/admin")
        public String admin() {
            return "admin";
        }
    }
