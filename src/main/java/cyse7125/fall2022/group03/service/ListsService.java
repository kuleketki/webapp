package cyse7125.fall2022.group03.service;

import org.springframework.http.ResponseEntity;

import com.alibaba.fastjson.JSONObject;

import cyse7125.fall2022.group03.model.Lists;


public interface ListsService {
    
    ResponseEntity<JSONObject> createList(Lists lists);
    ResponseEntity<JSONObject> getAllLists();
    ResponseEntity<JSONObject> getAList(String id);
}
