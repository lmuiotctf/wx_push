package com.wxpush.wxpush.controller;

import com.wxpush.wxpush.entiy.WxDefault;
import com.wxpush.wxpush.push.Pusher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class PushController {

        /**
         * 微信测试账号推送今天
         *
         */
        @GetMapping("/push/today")
        public void push() {
            WxDefault wxDefault=new WxDefault();
            System.out.println(wxDefault);
            Pusher.push(wxDefault);
        }

}
