package cyse7125.fall2022.group03.service;

import org.springframework.http.ResponseEntity;

import com.alibaba.fastjson.JSONObject;

import cyse7125.fall2022.group03.model.Task;

public interface TaskService {
    
    ResponseEntity<JSONObject> createTask(Task task);
    ResponseEntity<JSONObject> getAllTasksUnderAList(String listId);
    ResponseEntity<JSONObject> getAllTasks(); //self
    ResponseEntity<JSONObject> getATask(String listId, String taskId);
}