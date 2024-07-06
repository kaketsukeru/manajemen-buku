package donny.application.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/support")
public class SupportApi {

    @Value("${environment.name}")
    private String environmentName;

    @GetMapping("/env")
    public String getEnvironmentName(){
        return environmentName;
    }
}
