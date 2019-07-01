package design.model.command;

/**
 * @创建人 sgwang
 * @name RespondCommand
 * @user 91119
 * @创建时间 2019/7/1
 * @描述
 */
public class RespondCommand extends Command {
    private Receiver receiver;

    public RespondCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.doRes();
    }
}
