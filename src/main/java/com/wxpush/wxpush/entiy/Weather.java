package com.wxpush.wxpush.entiy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Weather {
    private String wd_night;
    private String date;
    private String high;
    private String week;
    private String text_night;
    private String wd_day;
    private String low;
    private String wc_night;
    private String text_day;
    private String wc_day;
    private String text_now;
    private String temp;

}
