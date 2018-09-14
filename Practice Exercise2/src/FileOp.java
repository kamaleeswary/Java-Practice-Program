import java.io.*;
public class FileOp {
    public static void main(String[] args) throws IOException {
        File f1 = new File("/home/niit/Desktop/input.txt");
        int t=0;
       // Scanner sc=new Scanner(System.in);
        BufferedReader in = (new BufferedReader(new FileReader(f1)));
        int ch;
        while ((ch = in.read()) != -1)
        {t++;
            if (Character.isLowerCase(ch))
            {
                ch=Character.toUpperCase(ch);

            }
            System.out.print((char)ch);
        }
        System.out.println(" File Length of the file is "+f1.length());
        in.close();

    }
}
