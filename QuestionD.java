import java.util.*;

public class QuestionD {
    // mapping from char (digit/operator) -> 3x3 string representation
    static Map<Character, String[]> seg = new HashMap<>();

    static void init() {
        // Digits 0-9 (classic 7-seg style, each is 3 rows of 3 chars)
        seg.put('0', new String[]{" _ ", "| |", "|_|"});
        seg.put('1', new String[]{"   ", "  |", "  |"});
        seg.put('2', new String[]{" _ ", " _|", "|_ "});
        seg.put('3', new String[]{" _ ", " _|", " _|"});
        seg.put('4', new String[]{"   ", "|_|", "  |"});
        seg.put('5', new String[]{" _ ", "|_ ", " _|"});
        seg.put('6', new String[]{" _ ", "|_ ", "|_|"});
        seg.put('7', new String[]{" _ ", "  |", "  |"});
        seg.put('8', new String[]{" _ ", "|_|", "|_|"});
        seg.put('9', new String[]{" _ ", "|_|", " _|"});

        // Operators (+, -, *, %, =)
        seg.put('+', new String[]{"   ", " _ ", "   "}); // simplified for this prob
        seg.put('-', new String[]{"   ", " _ ", "   "});
        seg.put('*', new String[]{"   ", " * ", "   "}); // treat as placeholder
        seg.put('%', new String[]{"%  ", "   ", "  %"});
        seg.put('=', new String[]{"   ", " _ ", " _ "});
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String[] rows = new String[3];
        for (int i = 0; i < 3; i++) rows[i] = sc.nextLine();

        init();

        // break input into chars of width 3
        List<String[]> chars = new ArrayList<>();
        for (int k = 0; k < N; k++) {
            String[] part = new String[3];
            for (int r = 0; r < 3; r++) {
                part[r] = rows[r].substring(k*3, (k+1)*3);
            }
            chars.add(part);
        }

        // Try each position as faulty
        for (int pos = 0; pos < N; pos++) {
            for (char c : seg.keySet()) {
                if (matchesOrOneToggle(chars.get(pos), seg.get(c))) {
                    // replace this char
                    List<Character> expr = new ArrayList<>();
                    for (int i = 0; i < N; i++) {
                        if (i == pos) expr.add(c);
                        else expr.add(recognize(chars.get(i)));
                    }
                    if (checkEquation(expr)) {
                        System.out.println(pos+1);
                        return;
                    }
                }
            }
        }
    }

    // recognizer for exact match
    static char recognize(String[] part) {
        for (Map.Entry<Character,String[]> e : seg.entrySet()) {
            if (Arrays.equals(e.getValue(), part)) return e.getKey();
        }
        return '?'; // faulty
    }

    // check if pattern matches with <=1 LED difference
    static boolean matchesOrOneToggle(String[] given, String[] standard) {
        int diff = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (given[i].charAt(j) != standard[i].charAt(j)) diff++;
                if (diff > 1) return false;
            }
        }
        return diff == 1 || diff == 0;
    }

    // evaluate expr left-to-right (no precedence)
    static boolean checkEquation(List<Character> expr) {
        // split at '='
        int eqPos = expr.indexOf('=');
        if (eqPos == -1) return false;

        long lhs = eval(expr.subList(0, eqPos));
        long rhs = eval(expr.subList(eqPos+1, expr.size()));
        return lhs == rhs;
    }

    static long eval(List<Character> arr) {
        long cur = arr.get(0) - '0';
        int i = 1;
        while (i < arr.size()) {
            char op = arr.get(i++);
            long nxt = arr.get(i++) - '0';
            if (op == '+') cur = cur + nxt;
            else if (op == '-') cur = cur - nxt;
            else if (op == '*') cur = cur * nxt;
            else if (op == '%') cur = cur % nxt;
        }
        return cur;
    }
}
