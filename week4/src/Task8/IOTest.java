package Task8;

import java.io.IOException;
import java.nio.file.Path;

/**
 * @author LXX
 * @date 2021/3/5-13:22
 */
public class IOTest {
    /*
    * 在电脑 c 盘的 csatest 目录下，创建一个名称为 demo.txt 的文件。然后将下列内容：
"csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa20
21csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2
021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021"添
加到 demo.txt 中，接着
* !!!利用 java 程序读取该文件中的内容，计算出总共有多少个 2021,并输
出到控制台。*/
    public static void main(String[] args) throws IOException {
        Path filePath = Path.of("C:\\csatest\\demo.txt");
    }


}
