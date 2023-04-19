package htwberlin.todobackend;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @GetMapping("/greeting/welcome/")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name) {
        return "hello, " + name;
    }

    @GetMapping("/path/param/{name}/{par2}")
    public String pathparam(
            @PathVariable(name="name") String nam,
            @PathVariable(name="par2") String par2) {
        return "hello, " + nam+par2;
    }

    @GetMapping("/path/param")
    public String pathparam(
            @RequestHeader(value="User-Agent") String par2) {
        return "hello, " + par2;
    }

    @PostMapping("/post")
    public String postparam() {
        return "hello, ";
    }

    @GetMapping("/")
    public String root() {
        return "hello";
    }
}
