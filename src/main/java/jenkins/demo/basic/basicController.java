package jenkins.demo.basic;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/basic")
public class basicController {

    @GetMapping("/hello")
    public String textBasic(Model model) {
        model.addAttribute("data" , "Hello Jenkins");
        return "basic/hello";
    }
}
