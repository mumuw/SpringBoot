package com.lin.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduleService {
    //fixedRate 任务每次间隔固定时间就再次执行 : 例如每格5秒调用一次此方法 不管该方法耗时多久
//    @Scheduled(fixedRate = 5000)    //5second
    private void testScheduleFixedRate() {
        System.out.println("schedule ........... fixedRate " + System.currentTimeMillis());
    }

    //fixedDelay 任务在前一次执行完后多久时间再执行一次 : 例如每次此方法执行5秒后再次执行一次
//    @Scheduled(fixedDelay = 5000)    //5second
    private void testScheduleFixedDelay() {
        System.out.println("schedule ........... fixedDelay" + System.currentTimeMillis());
    }
                      //秒 分钟 小时 日 月 星期 年
//    @Scheduled(cron = "5 * * * * ?") //每个分钟的第5秒        在线生成cron表达式 http://cron.qqe2.com/
    private void testScheduleCron() {
        System.out.println("schedule cron........... " + System.currentTimeMillis());
    }


    //initialDelay的参数，是第一次调用前需要等待的时间
//    @Scheduled(initialDelay = 5000, fixedRate = 5000)    //5second
    private void testScheduleFixedRateAndInitalDelay() {
        System.out.println("schedule ........... InitalDelay and fixedRate " + System.currentTimeMillis());
    }

}
