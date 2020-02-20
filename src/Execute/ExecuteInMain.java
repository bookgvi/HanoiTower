package Execute;

public class ExecuteInMain<T> {
    private Execute<T> exec;

    public ExecuteInMain(Execute<T> exec) {
        this.exec = exec;
    }

    public T run() {
        return this.exec.execute();
    }
}
