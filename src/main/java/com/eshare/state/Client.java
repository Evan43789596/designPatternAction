package com.eshare.state;

/**
 * Created by liangyh on 2018/1/4.
 * Email:10856214@163.com
 */
public class Client {

    public static void main(String[] args){
        AutoApprovalFlowContext sm = new AutoApprovalFlowContext();
        sm.setActivity(new AuditStartActivity());
        sm.setVariables("");
        sm.process();
    }
}
