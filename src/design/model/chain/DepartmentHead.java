package design.model.chain;

/**
 * @创建人 sgwang
 * @name DepartmentHead
 * @user 91119
 * @创建时间 2019/7/1
 * @描述 具体处理者2：系主任类
 */

class DepartmentHead extends Leader {
    public void handleRequest(int LeaveDays) {
        if (LeaveDays <= 7) {
            System.out.println("系主任批准您请假" + LeaveDays + "天。");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(LeaveDays);
            } else {
                System.out.println("请假天数太多，没有人批准该假条！");
            }
        }
    }
}
