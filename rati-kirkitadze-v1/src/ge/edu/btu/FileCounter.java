package ge.edu.btu;
import java.io.File;
import java.util.Objects;

public class FileCounter {
    public static void main(String[] args) {
        File dir=new File( "BTU_DIRECTORY");
        int btu=0;
        for (File files:Objects.requireNonNull(dir.listFiles())) {
            if (files.getName().startsWith("btu"))
                btu=btu+1;
        }System.out.println("რაოდენობა : " + btu);

    }
}

