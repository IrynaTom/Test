package com.test.stepFP;

public class Schedule_task {
    public static void main(String[] args) {
        int[] deadline = new int[5];
        int[] cost = new int[5];
        boolean [] used=new boolean[2];
        long sum = 0;
        int n=5;
        deadline[0]=1;
        deadline[1]=2;
        deadline[2]=2;
        deadline[3]=3;
        deadline[4]=5;

        cost[0]=2;
        cost[1]=5;
        cost[2]=4;
        cost[3]=1;
        cost[4]=3;
int Tmax=0;
        used[0]=0;
        used[1]=false;



for(int i=0; i< n; i++){
    int k= deadline[i];
    while (k>= 1 && used[k]){
        k--;
    }
    if (k==0){
        continue;
    }
    used[k]=true;
    sum+=cost[i];
    System.out.println(sum);
}
    }
}
