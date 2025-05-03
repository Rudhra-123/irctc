package org.example.services;
import java.io.File;
import java.util.*;

public class UserBookingService {
    

    private User user;
    private List<User> userList;

// object mapper is to serialize and deserialize the json file
    private static final ObjectMapper objectMapper = new ObjectMapper();


    private static final String USER_PATH = "../localDb/user.json";

    public UserBookingService(User user1) {
        this.user = user1;

        File users =new File(USER_PATH); 
        userList =new objectMapper.readValue(users, new TypeReference<List<User>>() {});   
}
