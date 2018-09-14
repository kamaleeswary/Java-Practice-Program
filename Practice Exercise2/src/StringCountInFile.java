import java.io.*;
import java.lang.*;
public class StringCountInFile {
    public static void main(String[] args) throws IOException {
        File f1 = new File("/home/niit/Desktop/FileDemo.txt");
        int t=0,count=0,k=0;
        String[] words=new String[50];
        BufferedReader in = (new BufferedReader(new FileReader(f1)));
        String line;
        String[] wordcount=new String[50];
        while ((line = in.readLine()) != null) {
            words = line.split(" ");}
            t=words.length;
            for(int i=0;i<t;i++){count=0;
                for(int j=t-1;j>=0;j--){
                if(words[i].equals(words[j]))
                {

               //  words[j]="";
                    count++;
                }
                wordcount[k]=words[i];


            } System.out.println(wordcount[k]+" "+count);
               // System.out.println(words[i]+" Repeated in "+count+" times.");
            }



    }
}
