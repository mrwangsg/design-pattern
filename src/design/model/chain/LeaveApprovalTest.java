package design.model.chain;

/**
 * @创建人 sgwang
 * @name LeaveApprovalTest
 * @user 91119
 * @创建时间 2019/7/1
 * @描述
 */
public class LeaveApprovalTest {
    public static void main(String[] args) {
        //组装责任链
        Leader leader01 = new ClassAdviser();
        Leader leader02 = new DepartmentHead();
        Leader leader03 = new Dean();
        Leader leader04 = new DeanOfStudies();

        leader01.setNext(leader02);
        leader02.setNext(leader03);
        leader03.setNext(leader04);

        //提交请求
        leader01.handleRequest(8);
    }
}
