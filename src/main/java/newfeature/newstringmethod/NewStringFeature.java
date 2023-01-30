package newfeature.newstringmethod;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

/**
 * isBlank()：如果字符串为空或字符串仅包含空格（包括制表符），则返回 true。注意与isEmpty() 不同，isEmpty()仅在长度为 0 时返回 true。
 * lines()：将字符串拆分为字符串流，每个字符串包含一行。
 * strip() ： 分别从开头和结尾；
 * stripLeading()/stripTrailing()仅开始和仅结束删除空格。
 * repeat(int times)：返回一个字符串，该字符串采用原始字符串并按指定的次数重复该字符串。
 * readString()：允许从文件路径直接读取到字符串。
 * writeString(Path path)：将字符串直接写入指定路径处的文件。
 * indent(int level)：缩进字符串的指定量。负值只会影响前导空格。
 * transform(Function f)：将给定的 lambda 应用于字符串。
 */
public class NewStringFeature {

    public static void main(String[] args) throws IOException {
        // lines()方法示例
        String str = "hello \njava17 \n\r!\r";
        Stream<String> lines = str.lines();
        lines.forEach(System.out::println);
        // readString()方法示例
        Path path = Path.of("/u01/workspace/java17-docs/src/main/java/newfeature/newstringmethod/NewStringFeature.java");
        String text = Files.readString(path);
        System.out.println(text);
    }
}
