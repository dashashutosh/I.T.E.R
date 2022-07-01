package GreeedyAlgorithms;

import java.io.*;
import java.util.*;
  
class IntervalScheduling 
{
  int start, finish;
  
  public IntervalScheduling(int start, int finish)
  {
    this.start = start;
    this.finish = finish;
  }
}
  
class Compare 
{
  
  static void compare(IntervalScheduling arr[], int n)
  {
    Arrays.sort(arr, new Comparator<IntervalScheduling>()
                {
                  @Override
                  public int compare(IntervalScheduling s1, IntervalScheduling s2)
                  {
                    return s1.finish - s2.finish;
                  }
                });
  }
}
  
class GFG {
  
  static void printMaxActivities(IntervalScheduling arr[], int n)
  {
    Compare obj = new Compare();
    obj.compare(arr, n);
    System.out.println(
      "Following activities are selected :");
  
    int i = 0;
    System.out.print("(" + arr[i].start + ", "
                     + arr[i].finish + "), ");
  
    for (int j = 1; j < n; j++) 
    {
      if (arr[j].start >= arr[i].finish)
      {
        System.out.print("(" + arr[j].start + ", "
                         + arr[j].finish + "), ");
        i = j;
      }
    }
  }
  
  public static void main(String[] args)
  {
  
    int n = 6;
    IntervalScheduling arr[] = new IntervalScheduling[n];
    arr[0] = new IntervalScheduling(5, 9);
    arr[1] = new IntervalScheduling(1, 2);
    arr[2] = new IntervalScheduling(3, 4);
    arr[3] = new IntervalScheduling(0, 6);
    arr[4] = new IntervalScheduling(5, 7);
    arr[5] = new IntervalScheduling(8, 9);
  
    printMaxActivities(arr, n);
  }
}