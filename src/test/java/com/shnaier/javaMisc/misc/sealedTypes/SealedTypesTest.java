package com.shnaier.javaMisc.misc.sealedTypes;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SealedTypesTest {

    @Autowired
    SealedTypes sealedTypes;

    @Test
    void sealedTypesTest() {
        UserDataResult validUserData = sealedTypes.getUserData("valid-user");
        UserDataResult inValidUserData = sealedTypes.getUserData("");
        UserDataResult restrictedUserData = sealedTypes.getUserData("restricted");
        UserDataResult notFoundUserData = sealedTypes.getUserData("notFound");

        assertAll(
                () -> assertInstanceOf(UserData.class, validUserData),
                () -> assertInstanceOf(UserNotValid.class, inValidUserData),
                () -> assertInstanceOf(UserRestricted.class, restrictedUserData),
                () -> assertInstanceOf(UserNotFound.class, notFoundUserData)
        );
    }
}