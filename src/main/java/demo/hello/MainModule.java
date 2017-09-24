package demo.hello;

import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;

/**
 * Created by mzy on 17/9/24.
 */
public class MainModule {
    @At("/hello")
    @Ok("jsp:jsp.hello")
    public String doHello() {
        return "Hello Nutz";
    }
}
