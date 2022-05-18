package io.camunda.tasklist;

import io.camunda.tasklist.dto.Task;

public interface TaskConsumer {

    void onNewTask(Task task);
    
}
