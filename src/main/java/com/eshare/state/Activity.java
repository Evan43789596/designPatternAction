package com.eshare.state;

/**
 * 节点
 * Created by liangyh on 2018/1/3.
 * Email:10856214@163.com
 */
public interface Activity {
    /**
     * 执行
     * @param sm 状态机上下文对象
     */
    public void process(FlowContext sm);
}
