package com.lin.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class AsyncTaskService {
//    @Async
    public void executeAsyncTask(Integer integer) {
        System.out.println("execute task :" + integer);
    }

//    @Async
    public void executeAsyncTaskPlus(Integer integer) {
        System.out.println("execute task + 1:" + (integer + 1));
    }
}
