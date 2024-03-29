import java.util.*;
import java.io.*;
import java.util.Arrays;

public class Lab07{

    public static float mean(float[] data){
        float sum = 0;
        for(int i = 0; i<data.length; i++){
            sum = sum+data[i];
        }
        float mean = sum/(data.length);
        return mean;
    }
    public static float median(float[] data){
        float[] newdata = data;
        Arrays.sort(newdata);
        int n = newdata.length;
        float median;
        if (n % 2 == 0) {
            median = (newdata[n/2-1] + newdata[n/2]) / 2.0f;
        } else {
            median = newdata[n/2];
        }
        return median;
    }
    

    static float mode(float data[]) {
        float maxValue = 0;
        int maxCount = 0, i, j;
  
        for (i = 0; i < data.length; ++i) {
           int count = 0;
           for (j = 0; j < data.length; ++j) {
              if (data[j] == data[i])
              ++count;
           }
  
           if (count > maxCount) {
              maxCount = count;
              maxValue = data[i];
           }
        }
        return maxValue;
     }


    static float maximum(float[] data){
        float max = 0;
        for(int i = 0; i<data.length;i++){
            if(data[i]>max){
                max = data[i];
            }
        }
        return max;
    }

    static float minimum(float[] data){
        float min = data[0];
        for(int i = 0; i<data.length; i++){
            if(data[i]<min){
                min = data[i];
            }
        }
        return min;
    }
    
    public static void main(String[] args){
        float[] sepallength = new float[150];
        float[] sepalwidth = new float[150];
        float[] petallength = new float[150];
        float[] petalwidth = new float[150];

        try{
            File file = new File("Iris.csv");
            Scanner sc = new Scanner(file);
            int i = 0;
            while(sc.hasNextLine()){
                String temp = sc.nextLine();
                String[] arr = temp.split(",");
                sepallength[i] =Float.parseFloat(arr[1]);
                sepalwidth[i] =Float.parseFloat(arr[2]);
                petallength[i] =Float.parseFloat(arr[3]);
                petalwidth[i] =Float.parseFloat(arr[4]);
                i++;
            }
            System.out.println("======================================================================");
            System.out.println("                       FIVE POINT SUMMARY                         ");
            System.out.println("======================================================================");
            System.out.println("ITEM            MEAN       MEDIAN       MODE      MINIMUM      MAXIMUM  ");
            System.out.println("______________________________________________________________________");
            System.out.println("Sepal Length  "+mean(sepallength)+"      "+median(sepallength)+"        "+mode(sepallength)+"         "+minimum(sepallength)+"           "+maximum(sepallength));
            System.out.println("Sepal Width   "+mean(sepalwidth)+"          "+median(sepalwidth)+"        "+mode(sepalwidth)+"         "+minimum(sepalwidth)+"           "+maximum(sepalwidth));
            System.out.println("Petal Length  "+mean(petallength)+"      "+median(petallength)+"        "+mode(petallength)+"         "+minimum(petallength)+"           "+maximum(petallength));
            System.out.println("Petal Width   "+mean(petalwidth)+"      "+median(petalwidth)+"        "+mode(petalwidth)+"         "+minimum(petalwidth)+"           "+maximum(petalwidth));
            System.out.println("______________________________________________________________________");
            float[] setosa_s_length = new float[50];
            float[] setosa_s_width = new float[50];
            float[] setosa_p_length = new float[50];
            float[] setosa_p_width = new float[50];

            for(int k = 0;k<50;k++){
                setosa_s_length[k] = sepallength[k];
                setosa_s_width[k] = sepalwidth[k];
                setosa_p_length[k] = petallength[k];
                setosa_p_width[k] = petalwidth[k]; 
            }

            System.out.println(setosa_p_length[2]);

            System.out.println("======================================================================");
            System.out.println("                       FIVE POINT SUMMARY(SETOSA)                         ");
            System.out.println("======================================================================");
            System.out.println("ITEM            MEAN       MEDIAN       MODE      MINIMUM      MAXIMUM  ");
            System.out.println("______________________________________________________________________");
            System.out.println("Sepal Length  "+mean(setosa_s_length)+"      "+median(setosa_s_length)+"        "+mode(setosa_s_length)+"         "+minimum(setosa_s_length)+"           "+maximum(setosa_s_length));
            System.out.println("Sepal Width   "+mean(setosa_s_width)+"     "+median(setosa_s_width)+"        "+mode(setosa_s_width)+"         "+minimum(setosa_s_width)+"           "+maximum(setosa_s_width));
            System.out.println("Petal Length  "+mean(setosa_p_length)+"     "+median(setosa_p_length)+"        "+mode(setosa_p_length)+"         "+minimum(setosa_p_length)+"           "+maximum(setosa_p_length));
            System.out.println("Petal Width   "+mean(setosa_p_width)+"    "+median(setosa_p_width)+"        "+mode(setosa_p_width)+"         "+minimum(setosa_p_width)+"           "+maximum(setosa_p_width));
            System.out.println("______________________________________________________________________");

            float[] versi_s_length = new float[50];
            float[] versi_s_width = new float[50];
            float[] versi_p_length = new float[50];
            float[] versi_p_width = new float[50];

            for(int k = 0;k<50;k++){
                versi_s_length[k] = sepallength[k+50];
                versi_s_width[k] = sepalwidth[k+50];
                versi_p_length[k] = petallength[k+50];
                versi_p_width[k] = petalwidth[k+50]; 
            }

            System.out.println("======================================================================");
            System.out.println("                     FIVE POINT SUMMARY(VERSICOLOR)                         ");
            System.out.println("======================================================================");
            System.out.println("ITEM            MEAN       MEDIAN       MODE      MINIMUM      MAXIMUM  ");
            System.out.println("______________________________________________________________________");
            System.out.println("Sepal Length  "+mean(versi_s_length)+"      "+median(versi_s_length)+"        "+mode(versi_s_length)+"         "+minimum(versi_s_length)+"           "+maximum(versi_s_length));
            System.out.println("Sepal Width   "+mean(versi_s_width)+"       "+median(versi_s_width)+"        "+mode(versi_s_width)+"         "+minimum(versi_s_width)+"           "+maximum(versi_s_width));
            System.out.println("Petal Length  "+mean(versi_p_length)+"          "+median(versi_p_length)+"        "+mode(versi_p_length)+"         "+minimum(versi_p_length)+"           "+maximum(versi_p_length));
            System.out.println("Petal Width   "+mean(versi_p_width)+"     "+median(versi_p_width)+"        "+mode(versi_p_width)+"         "+minimum(versi_p_width)+"           "+maximum(versi_p_width));
            System.out.println("______________________________________________________________________");

            float[] virgi_s_length = new float[50];
            float[] virgi_s_width = new float[50];
            float[] virgi_p_length = new float[50];
            float[] virgi_p_width = new float[50];

            for(int k = 0;k<50;k++){
                virgi_s_length[k] = sepallength[k+100];
                virgi_s_width[k] = sepalwidth[k+100];
                virgi_p_length[k] = petallength[k+100];
                virgi_p_width[k] = petalwidth[k+100]; 
            }

            System.out.println("======================================================================");
            System.out.println("                     FIVE POINT SUMMARY(VIRGINICA)                         ");
            System.out.println("======================================================================");
            System.out.println("ITEM            MEAN       MEDIAN       MODE      MINIMUM      MAXIMUM  ");
            System.out.println("______________________________________________________________________");
            System.out.println("Sepal Length  "+mean(virgi_s_length)+"      "+median(virgi_s_length)+"        "+mode(virgi_s_length)+"         "+minimum(virgi_s_length)+"           "+maximum(virgi_s_length));
            System.out.println("Sepal Width   "+mean(virgi_s_width)+"         "+median(virgi_s_width)+"       "+mode(virgi_s_width)+"         "+minimum(virgi_s_width)+"           "+maximum(virgi_s_width));
            System.out.println("Petal Length  "+mean(virgi_p_length)+"     "+median(virgi_p_length)+"        "+mode(virgi_p_length)+"         "+minimum(virgi_p_length)+"           "+maximum(virgi_p_length));
            System.out.println("Petal Width   "+mean(virgi_p_width)+"     "+median(virgi_p_width)+"        "+mode(virgi_p_width)+"         "+minimum(virgi_p_width)+"           "+maximum(virgi_p_width));
            System.out.println("_______________________________________________________________________");
        }catch(Exception exception){
            System.out.println(exception.getLocalizedMessage());
        }
       
    }
}
