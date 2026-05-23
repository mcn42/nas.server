package net.mnilsen.nas.server;

import net.mnilsen.nas.model.HomeResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author michaeln
 */

@RestController
public class HomeController {
    
    @GetMapping("/")
    public HomeResponse home() {
        return new HomeResponse("Mike Nilsen", "RUNNING");
    }
}
