public class Task {
    protected String description;
    protected boolean isDone;
    protected int index;
    protected String type;

    public Task(String description, int index) {
        this.description = description;
        this.index = index;
        this.isDone = false;
    }

    public void markAsDone() {
        this.isDone = true;
    }

    public String getStatusIcon() {
        return (isDone ? "X" : " "); // mark done task with X
    }
    public void printTask(){
        System.out.println(index + ". [" + type + "] [" + getStatusIcon() + "] " + description);
    }
}