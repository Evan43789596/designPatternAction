package com.eshare.state;

/**
 * 授信结果决策节点
 * Created by liangyh on 2018/1/4.
 * Email:10856214@163.com
 */
public class CreditResultStrategyActivity implements Activity {
    public void process(FlowContext sm) {
        System.out.println("**** 进入授信结果决策节点 ****");
        System.out.println("====>流程变量:"+sm.getVariables().toString());
        //执行业务逻辑
        System.out.println("====>调用决策引擎,获取授信结果");
        //执行下一个状态
        sm.setActivity(new AuditOverActivity());
        sm.process();
        System.out.println("**** 退出授信结果决策节点 ****");
    }
}
