package zipcode.group3.showboat.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public RedirectView ping()
    {
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("https://http.cat/200");
        return redirectView;
    }
}
