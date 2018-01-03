package com.eshare.state;

/**
 * 决策点1状态
 * Created by liangyh on 2018/1/4.
 * Email:10856214@163.com
 */
public class CreditStrategyFirstActivity implements Activity {
    public void process(FlowContext sm) {
        System.out.println("进入决策点1状态");
        //执行下一个状态
        sm.setActivity(new CreditStrategySecondActivity());
        sm.setVariables(null);
        sm.process();
    }
}
