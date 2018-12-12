package API;

public interface Command {

    /**
     * execute the command
     */
    void execute();

    void undo();
}
