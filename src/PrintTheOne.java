public class PrintTheOne {
    public enum OnlyOne {
        ONCE(true);
        private OnlyOne(boolean b) {
            System.out.print("constructing,");
        }
    }
    public enum Season {
        WINTER {
            public String getHours() { return "10am-3pm"; }
        },
        SPRING {
            public String getHours() { return "9am-5pm"; }
        },
        SUMMER {
            public String getHours() { return "9am-7pm"; }
        },
        FALL {
            public String getHours() { return "9am-5pm"; }
        };
        public abstract String getHours();
    }

    public static void main(String[] args) {
        System.out.print("begin,");
        OnlyOne firstCall = OnlyOne.ONCE;  // prints constructing,
        OnlyOne secondCall = OnlyOne.ONCE; // doesn't print anything
        System.out.print("end");
        Season a = Season.FALL;
        System.out.println(a.getHours());
    }
}
