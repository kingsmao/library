package com.kingmao.library.action;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author qinxuan
 * @date 2020/3/16
 */
@RestController
public class CurlController {

    private static Logger logger = LoggerFactory.getLogger(CurlController.class);

    /**
     * curl 带参传输
     * curl -X POST http://127.0.0.1:8080/curl1 -d "beginIn=2020-03-16 12:00:00&endIn=2020-01-01 12:20:45"
     */

    @PostMapping(value = "/curl1")
    public String curl1(@RequestParam(value = "beginIn", defaultValue = "") String beginIn,
                        @RequestParam(value = "endIn", defaultValue = "") String endIn,HttpServletRequest request,HttpServletResponse response){
        logger.info("beginIn:" + beginIn);
        logger.info("endIn:" + endIn);

        return "ok";
    }
}
