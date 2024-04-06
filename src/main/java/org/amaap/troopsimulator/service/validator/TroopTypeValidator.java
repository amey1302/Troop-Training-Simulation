package org.amaap.troopsimulator.service.validator;

public class TroopTypeValidator {
    public static boolean isNotInEnum(String input, Class<? extends Enum<?>> enumClass) {
        for (Enum<?> constant : enumClass.getEnumConstants()) {
            if (constant.name().equals(input)) {
                return false;
            }
        }
        return true;
    }
}
