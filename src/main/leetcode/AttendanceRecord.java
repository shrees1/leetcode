public class AttendanceRecord {
    public static boolean checkRecord(String s) {
        int countL = 0;
        int countP = 0;
        int countA = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == 'A'&& s.charAt(i+1) == 'A') {
                countA+=2;
            }
            if (s.charAt(i) == 'A') {
                countA++;
            }
            if (s.charAt(i) == 'L' && s.charAt(i + 1) == 'L') {
                countL++;
            }

        }
        if (!(countA > 1) && (countL < 2)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean res = checkRecord("PPALLP");
        System.out.println(res);
    }
}
