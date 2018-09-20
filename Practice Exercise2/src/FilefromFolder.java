import java.io.*;
public class FilefromFolder {


    private static final String file_dir = "/home/niit/bootstarp-pakage";
    private static final String file_ext = ".jpeg";

    public static void main(String args[])
    {
        new FilefromFolder().listFile(file_dir, file_ext);
    }

    public void listFile(String folder, String ext)
        {

        GenericExtFilter filter = new GenericExtFilter(ext);

        File dir = new File(folder);

        if (dir.isDirectory() == false)
        {
            System.out.println("Directory does not exists : " + file_dir);
            return;
        }

        String[] lt = dir.list(filter);

        if (lt.length == 0) {
            System.out.println("no files end with : " + ext);
            return;
        }int t=lt.length;
        System.out.println(t);
        while (t>0 ) {
            for (String file : lt) {
                String temp = new StringBuffer(file_dir).append(File.separator)
                        .append(file).toString();
                System.out.println("file : " + temp);
                t--;
            }
        }
    }
    // inner class, generic extension filter
    public class GenericExtFilter implements FilenameFilter {

        private String ext;

        public GenericExtFilter(String ext) {
            this.ext = ext;
        }

        public boolean accept(File dir, String name) {
            return (name.endsWith(ext));
        }
    }

}
