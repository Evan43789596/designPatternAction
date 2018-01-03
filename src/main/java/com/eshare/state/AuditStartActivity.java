package com.eshare.state;

/**
 * 审核开始节点
 * Created by liangyh on 2018/1/4.
 * Email:10856214@163.com
 */
public class AuditStartActivity implements Activity {

    public void process(FlowContext sm) {
        System.out.println("====>进入开始节点");
        //执行下一个状态
        sm.setActivity(new CreditStrategyFirstActivity());
        sm.setVariables(null);
        sm.process();

    }
}
