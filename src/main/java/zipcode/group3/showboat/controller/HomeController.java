package zipcode.group3.showboat.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity ping() throws URISyntaxException
    {
        URI pingUri = new URI("https://http.cat/200");
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setLocation(pingUri);
        return new ResponseEntity<>(httpHeaders, HttpStatus.OK);
    }
}
