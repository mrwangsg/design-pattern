package design.model.command;

/**
 * @创建人 sgwang
 * @name Invoker
 * @user 91119
 * @创建时间 2019/7/1
 * @描述
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action() {
        this.command.execute();
    }
}
