public class Main {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("JaCk BuY MoNkEy");
        System.out.println("Початковий рядок:" + str);
        int index1 = str.indexOf("J");
        int ln = str.length();

        for (int i = 0; i < ln; i++) {
            Character c = str.charAt(i);
            if (Character.isLowerCase(c)) {
                str.replace(i, i + 1,
                        Character.toUpperCase(c) + "");
            }
            else {
                str.replace(i, i + 1,
                            Character.toLowerCase(c) + "");
            }
        }
        System.out.println("Змінений регістр: " + str.replace(0, 1, "J"));
        System.out.println( "\u263B \u1F60 \u2763");
    }
}

