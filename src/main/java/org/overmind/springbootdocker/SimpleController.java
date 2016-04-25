package org.overmind.springbootdocker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author eugeme.karanda
 * @version 1.0 Create: 24.04.2016 22:44
 */
@RestController
public class SimpleController {

    @RequestMapping(method = RequestMethod.GET)
    public String hello() {
        return "Hello docker";
    }

}
