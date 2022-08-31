package com.wxpush.wxpush.controller;

import com.wxpush.wxpush.entiy.WxDefault;
import com.wxpush.wxpush.push.Pusher;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class JobController {

    WxDefault wxDefault=new WxDefault();
    //自行百度cron定时表达式
    @Scheduled(cron = "0/7 * * * * ?")
    public void goodMorning(){
        Pusher.push(wxDefault);
    }


}