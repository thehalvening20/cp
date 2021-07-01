import java.io.*;
import java.util.*;

public class Template {
    static class IO extends PrintWriter {
        BufferedReader br;
        StringTokenizer st;

        public IO() {
            super(System.out);
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public IO(String filename) throws IOException {
            super(new FileWriter(filename + ".out"));
            br = new BufferedReader(new FileReader(filename + ".in"));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }

        double nextDouble() { return Double.parseDouble(next()); }
    }

    public static void main(String[] args) throws IOException {
        var io = new IO();

        var n = io.nextInt();
        io.println(n);

        io.close();
    }
}
