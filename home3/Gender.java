class Gender {
    static char Gender(String gender) {
        if (gender.length() != 1 || !("fm".contains(gender.toLowerCase()))) {
            throw new IllegalArgumentException("Неверный формат пола. Используйте 'f' или 'm'.");
        }
        return gender.charAt(0);
    }
}
