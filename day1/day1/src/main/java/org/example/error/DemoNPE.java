package org.example.error;

import java.util.List;
import java.util.Optional;

public class DemoNPE {

    public static void main(String[] args) {
        UserDB userDB = new UserDB();
        Optional<List<User>> result = userDB.getAll();
        if(result.isEmpty()) {
            // No data
            return;
        }
        // Success

    }
}

class UserDB {
    public Optional<List<User>> getAll() {
        return Optional.empty();
    }
}

class User {
}
