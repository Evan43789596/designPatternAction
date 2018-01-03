package com.eshare.state;

/**
 * 结束状态节点
 * Created by liangyh on 2018/1/4.
 * Email:10856214@163.com
 */
public class AuditOverActivity implements Activity {

    public void process(FlowContext sm) {
        System.out.println("**** 进入结束节点 ****");
        System.out.println("====>流程变量:"+sm.getVariables().toString());
        System.out.println("====>保存审核结果");
        System.out.println("**** 退出结束节点 ****");


    }
}
