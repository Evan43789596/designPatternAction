package com.eshare.state;

/**
 * 授信决策点1节点
 * Created by liangyh on 2018/1/4.
 * Email:10856214@163.com
 */
public class CreditStrategyFirstActivity implements Activity {
    public void process(FlowContext sm) {
        System.out.println("**** 进入决策点1节点 ****");
        System.out.println("====>流程变量:"+sm.getVariables().toString());
        //处理业务逻辑
        System.out.println("====>执行决策引擎，获取决策结果");
        //执行下一个状态
        sm.setActivity(new CreditResultStrategyActivity());
        sm.process();
        System.out.println("**** 退出进入决策点1节点 ****");
    }
}
