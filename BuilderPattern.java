public class BuilderPattern {
    public static void main(String args[] ) {
        User user1 = User.builder()
        .id(1001)
        .age(23)
        .contactNum("+91-1230439813")
        .name("Magus")
        .email("magus.carlson@doomsday.com")
        .code("U_001")
        .build();

        User user2 = User.builder()
        .id(1001)
        .name("Magus")
        .email("magus.carlson@doomsday.com")
        .code("U_001")
        .build();

        System.out.println(user1);
        System.out.println(user2);
    }
}
