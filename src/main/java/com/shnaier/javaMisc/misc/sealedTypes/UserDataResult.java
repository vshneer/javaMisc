package com.shnaier.javaMisc.misc.sealedTypes;

public sealed interface UserDataResult permits UserData, UserNotFound, UserRestricted, UserNotValid{
}
