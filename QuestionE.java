import java.util.*;

public class QuestionE {
    static class Line {
        int x1, y1, x2, y2;
        Line(int a, int b, int c, int d) {
            x1=a; y1=b; x2=c; y2=d;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Line> lines = new ArrayList<>();
        for (int i=0;i<N;i++){
            lines.add(new Line(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
        int K = sc.nextInt();

        // Step 1: Find intersections
        Map<String, List<Line>> stars = new HashMap<>();
        for (int i=0;i<N;i++){
            for (int j=i+1;j<N;j++){
                int[] p = intersect(lines.get(i), lines.get(j));
                if (p != null) {
                    String key = p[0] + "," + p[1];
                    stars.putIfAbsent(key, new ArrayList<>());
                    stars.get(key).add(lines.get(i));
                    stars.get(key).add(lines.get(j));
                }
            }
        }

        int total = 0;
        // Step 2: Process only stars with exactly K lines
        for (String key : stars.keySet()) {
            String[] parts = key.split(",");
            int x = Integer.parseInt(parts[0]);
            int y = Integer.parseInt(parts[1]);

            // remove duplicates
            Set<Line> uniq = new HashSet<>(stars.get(key));
            if (uniq.size() == K) {
                // compute intensity
                int intensity = computeIntensity(uniq, x, y);
                total += intensity;
            }
        }
        System.out.println(total);
    }

    // Check if two lines intersect and return intersection point
    static int[] intersect(Line a, Line b) {
        // Handle vertical/horizontal/diagonal lines aligned with grid
        // Only simple case where lines actually cross inside integer coords
        // If they share a point, return it
        // For brevity here:
        if (a.x1==a.x2 && b.y1==b.y2) { // vertical vs horizontal
            if (between(b.x1, a.x1, b.x2) && between(a.y1, b.y1, a.y2)) {
                return new int[]{a.x1, b.y1};
            }
        }
        return null;
    }

    static boolean between(int a, int mid, int b) {
        return (mid>=Math.min(a,b) && mid<=Math.max(a,b));
    }

    static int computeIntensity(Set<Line> lines, int x, int y) {
        List<Integer> counts = new ArrayList<>();
        for (Line l : lines) {
            if (x==l.x1 && y==l.y1 || x==l.x2 && y==l.y2) {
                // case 1
                counts.add(countCells(x,y,l.x1,l.y1,l.x2,l.y2));
            } else {
                // case 2 - both sides
                int c1 = countCells(x,y,l.x1,l.y1,x,y);
                int c2 = countCells(x,y,x,y,l.x2,l.y2);
                counts.add(c1);
                counts.add(c2);
            }
        }
        return Collections.min(counts);
    }

    static int countCells(int x1,int y1,int x2,int y2,int xe,int ye){
        return Math.max(Math.abs(x1-xe), Math.abs(y1-ye));
    }
}
