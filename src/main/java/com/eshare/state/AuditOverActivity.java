package com.eshare.state;

/**
 * 结束状态节点
 * Created by liangyh on 2018/1/4.
 * Email:10856214@163.com
 */
public class AuditOverActivity implements Activity {

    public void process(FlowContext sm) {
        System.out.println("进入结束节点");


    }
}
