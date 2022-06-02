import java.io.*;

class ReadWriteFile {
    public static byte getinput()[] throws IOException {
        byte Inp[] = new byte[50];
        System.out.println("Enter input = ");
        for (int i = 0; i < 50; i++) {
            Inp[i] = (byte) System.in.read();
        }
        return Inp;
    }

    public static void main(String[] args) throws Exception {
        byte Input[] = getinput();
        OutputStream F = new FileOutputStream(
                "C:\\Users\\91800\\Desktop\\DIVYANSHU-2002\\programing java\\lab\\write.txt");
        for (int i = 0; i < 50; i++) {
            F.write(Input[i]);
        }

        F.close();
        int size;
        InputStream f1 = new FileInputStream(
                "C:\\Users\\91800\\Desktop\\DIVYANSHU-2002\\programing java\\lab\\write.txt");
        size = f1.available();

        System.out.println("Reading the content of writ.txt");
        for (int i = 0; i < size; i++) {
            System.out.println((char) f1.read());
        }
        f1.close();

    }
}