package springTest.com.test.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	
    @RequestMapping(value="/urlTest", method=RequestMethod.GET)
    public String urlTest() {
        return "/test/testView";    // JSP 경로
    }
}
