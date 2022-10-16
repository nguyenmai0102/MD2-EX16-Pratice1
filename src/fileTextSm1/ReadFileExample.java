package fileTextSm1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFileExample {
    public void readFileText(String filePath) throws FileNotFoundException {
        try {
            // doc file theo duong dan
            File file = new File(filePath);

            // kie tra neu file khong ton tai thi nem ra ngoai le.
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            // doc tung dong cua file va tien hanh cong tong lai
            BufferedReader br =new BufferedReader(new FileReader(file));
            String line = " ";
            int sum = 0;
            while((line = br.readLine()) !=null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            // hien thi ra man hinh tong cac so nguyen trong file
            System.out.println("tong = " + sum);

        }catch (Exception e) {
            // TH filr khong ton tai hoc noi dung file co loi thi se hien thi thong bao loi.
            System.out.println("file khong ton tai hoac noi dung co loi!");

        }
    }
}
