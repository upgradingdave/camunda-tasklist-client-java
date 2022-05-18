package io.camunda.tasklist.exception;

public class TaskListException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = -7593616210087047797L;

    public TaskListException() {
        super();
    }

    public TaskListException(Throwable e) {
        super(e);
    }

    public TaskListException(String message) {
        super(message);
    }
}