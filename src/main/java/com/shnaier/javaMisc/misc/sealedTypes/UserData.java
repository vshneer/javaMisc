package com.shnaier.javaMisc.misc.sealedTypes;

public record UserData(String payload, String userId) implements UserDataResult {
}
