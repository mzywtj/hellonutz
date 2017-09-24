package demo.hello;

import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;

/**
 * Created by mzy on 17/9/24.
 */
public class MainModule {
    @At("/hello")//请求路径
    @Ok("jsp:jsp.hello")//返回页面地址
    public String doHello() {
        return "Hello Nutz";
    }
}
