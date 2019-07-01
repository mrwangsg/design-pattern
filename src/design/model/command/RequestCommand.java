package design.model.command;

/**
 * @创建人 sgwang
 * @name CommandImpl
 * @user 91119
 * @创建时间 2019/7/1
 * @描述
 */
public class RequestCommand extends Command {
    private Receiver receiver;

    public RequestCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        this.receiver.doReq();
    }
}
