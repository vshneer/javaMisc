package com.shnaier.javaMisc.misc.sealedTypes;

import org.springframework.stereotype.Component;

@Component
public class SealedTypes {
    public UserDataResult getUserData(String userId){
        if (userId == null || userId.isBlank()) {
            return new UserNotValid();
        }
        if (userId.equals("restricted")) {
            return new UserRestricted();
        }
        if (userId.equals("notFound")) {
            return new UserNotFound();
        }
        return new UserData("User data for " + userId, userId);
    }
}
