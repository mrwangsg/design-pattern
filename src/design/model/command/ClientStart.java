package design.model.command;

/**
 * @创建人 sgwang
 * @name ClientStart
 * @user 91119
 * @创建时间 2019/7/1
 * @描述
 */
public class ClientStart {
    public static void main(String[] args){
        Receiver receiver = new Receiver();
        Invoker invoker = new Invoker();

        // 封装请求命令 并设置接收者
        Command reqCommand = new RequestCommand(receiver);

        // 封装响应命令 并设置接收者
        Command resCommand = new RespondCommand(receiver);

        // 调用者执行命令
        invoker.setCommand(reqCommand);
        invoker.action();

        invoker.setCommand(resCommand);
        invoker.action();
    }
}
