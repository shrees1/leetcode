import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Solution {
        public static void main(String[] args) throws IOException {
//            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//            PrintWriter wr = new PrintWriter(System.out);
//            String[] str = br.readLine().split(" ");
//            int N = Integer.parseInt(str[0]);
//            int M = Integer.parseInt(str[1]);
//            int[][] arr = new int[2][N];
//            for(int i_arr=0; i_arr<2; i_arr++)
//            {
//                String[] arr_arr = br.readLine().split(" ");
//                for(int j_arr=0; j_arr<arr_arr.length; j_arr++)
//                {
//                    arr[i_arr][j_arr] = Integer.parseInt(arr_arr[j_arr]);
//                }
//            }
//            int Q = Integer.parseInt(br.readLine().trim());
//            int[][] queries = new int[Q][2];
//            for(int i_queries=0; i_queries<Q; i_queries++)
//            {
//                String[] arr_queries = br.readLine().split(" ");
//                for(int j_queries=0; j_queries<arr_queries.length; j_queries++)
//                {
//                    queries[i_queries][j_queries] = Integer.parseInt(arr_queries[j_queries]);
//                }
//            }
//
//            String[] out_ = solve(M, arr, queries);
//            for (int i_out_=0; i_out_<out_.length; i_out_++)
//            {
//                System.out.println(out_[i_out_]);
//            }
//
//            wr.close();
//            br.close();
            int m = 5;
            int n =3;
            int[][] data = new int[][]{{5 ,2 ,6, 4, 1},{1,2,3,4,5}};
            int [][] query = new int [][]{{5, 1},
                    {4 ,4},
                    {3 ,16},
                    {1 ,16},
                    {2 ,8}};
            solve(3,data,query);
        }
        public static class Data{
            public int quantity;
            public int priority;
            public int position;
            public int startDate;
            public int endDate;
        }
        static String[] solve(int M, int[][] arr, int[][] queries){
            // Your Code Here

            List<Data> dataList = new ArrayList<>();
            HashMap<Integer,Data> dataSet = new HashMap<>();
            for(int i =0;i<arr[0].length;i++)
            {
                Data data = new Data();
                data.quantity = arr[0][i];
                data.priority = arr[1][i];
                data.position =i;
                dataList.add(data);
                dataSet.put(i,data);
            }
            Collections.sort(dataList,(a,b)->{return -(a.priority-b.priority);});
            Data data = dataList.get(0);
            data.startDate=1;
            data.endDate=data.quantity;
            int  min =0;
            if(data.quantity%M>0)
                min= data.quantity/M+1;
            else
                min = data.quantity/M;
            for( int i=1;i<dataList.size();i++)
            {
                Data tempData = dataList.get(i-1);
                data = dataList.get(i);
                data.startDate=min+1;
                data.endDate= tempData.endDate+data.quantity;
                if(data.quantity%M>0)
                    min= min + data.quantity/M+1;
                else
                    min = min +data.quantity/M;
            }
//            if(data.quantity%M>0)
//                data.endDate= data.quantity/M+1;
            String []  result = new String[queries.length];
            for(int i =0;i<queries.length;i++)
            {
                data = dataSet.get(queries[i][0]-1);
                if(data.startDate<=queries[i][1]&&queries[i][1]<=data.endDate)
                    result[i]="yes";
                else
                    result[i]="no";
            }
            return result;
        }
    }
