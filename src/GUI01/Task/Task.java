package GUI01.Task;

public class Task {
    private String desc;
    private Task next;

    public Task(String desc, Task next) {
        this.desc = desc;
        this.next = next;
    }
    public Task(String desc) {
        this(desc,null);
    }
    public void setNextTask(Task t){
        this.next = t;
    }
    public void printTasks(){
        Task tmp = this;
        while (tmp!=null){
            System.out.print(tmp.desc+" ");
            tmp = tmp.next;
        }
    }
    public static void printTasks(Task head){
        while (head!=null){
            System.out.print(head.desc+" ");
            head = head.next;
        }
    }
    public void printTasksRev(){
      
    }
    public static void printTasksRev(Task head){

    }
}
