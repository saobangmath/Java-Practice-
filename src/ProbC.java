import java.io.*;
import java.util.*;

/**
 * @author Tran Anh Tai
 * @template for CP codes
 */
public class ProbC {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(in, out);
        out.close();
    }
    // main solver
    static class Task{
        public void solve(InputReader in, PrintWriter out) {
            int test = in.nextInt();
            String first = "Ayush";
            String second = "Ashish";
            for (int i = 0 ; i < test; i++){
                int n = in.nextInt();
                int x = in.nextInt();
                ArrayList<Integer> E[] = new ArrayList[n];
                for (int j = 0; j < n; j++){
                    E[j] = new ArrayList<>();
                }
                for (int j = 0; j < n - 1; j++){
                    int u = in.nextInt() - 1;
                    int v = in.nextInt() - 1;
                    E[u].add(v); E[v].add(u);
                }
                int cnt = 0;
                for (int dest : E[x- 1]){
                    cnt++;
                }
                if (cnt <= 1){
                    out.println(first);
                }
                else{
                    int au = n - 2;
                    if (au % 2 == 0){
                        out.println(first);
                    }
                    else{
                        out.println(second);
                    }
                }
            }
        }
    }
    // fast input reader class;
    static class InputReader {
        BufferedReader br;
        StringTokenizer st;

        public InputReader(InputStream stream) {
            br = new BufferedReader(new InputStreamReader(stream));
        }

        public String nextToken() {
            while (st == null || !st.hasMoreTokens()) {
                String line = null;
                try {
                    line = br.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                if (line == null) {
                    return null;
                }
                st = new StringTokenizer(line);
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextToken());
        }
        public long nextLong(){
            return Long.parseLong(nextToken());
        }
    }
}