public class Panda {
    final static String name = "Ronda";
    static final int bamboo;
    static final double height = 10; // DOES NOT COMPILE
    static { bamboo = 5;}
    enum Season {
        WINTER, SUMMER, FALL, SPRING
    }
    public enum OnlyOne {
        ONCE(true);
        private OnlyOne(boolean b) {
            System.out.print("constructing,");
        }
    }

    public static final void testEnum() {
        Season season = Season.FALL;

        switch (season) {
            case FALL:
                System.out.println(season);
                break;
            case SPRING:
                System.out.println(season);
                break;
            case SUMMER:
                break;
            default:
                break;
        }
    }
}
