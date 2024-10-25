package com.tntech.capstone.service;

import com.tntech.capstone.entity.ExampleEntity;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ExampleService {


       public List<ExampleEntity> findAll() { 
        List<ExampleEntity> myList = new ArrayList<ExampleEntity>();
        ExampleEntity itemOne = new ExampleEntity(1L, "Mr. Meow", "cat", "cat naps");
        ExampleEntity itemTwo = new ExampleEntity(2L, "Benji", "isopod", "swimming" );
        ExampleEntity itemThree = new ExampleEntity(3L, "Brazzos","detective", "baking");
        myList.add(itemOne);
        myList.add(itemTwo);
        myList.add(itemThree);
        return myList;
     }

}
