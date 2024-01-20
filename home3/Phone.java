class Phone {
    static long Phone(String phone) {
        try {
            return Long.parseLong(phone);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Неверный формат номера телефона. Используйте целое число без пробелов и разделителей.");
        }
    }
}
