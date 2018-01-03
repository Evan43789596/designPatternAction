package com.eshare.state;

/**
 * 状态机
 *
 * Created by liangyh on 2018/1/3.
 * Email:10856214@163.com
 *
 */
public class FlowContext {
    /**
     * 状态对象
     */
    private Activity activity;

    /**
     * 流程传输变量
     */
    private Object variables;

    /**
     * 业务执行方法
     */
    public void process() {
        this.activity.process(this);
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public Object getVariables() {
        return variables;
    }

    public void setVariables(Object variables) {
        this.variables = variables;
    }
}
