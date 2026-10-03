public class W7P3NicknameTag {
    static class NameTag {
        private final String firstName, lastName;
        NameTag(String fullName) {
            String[] p = fullName.split(" ");
            firstName = p[0]; lastName = p[1];
        }
        String getNickname() { return firstName + " " + lastName.charAt(0) + "."; }
    }
    public static void main(String[] args) {
        System.out.println(new NameTag("Maria Gomez").getNickname());
    }
}
