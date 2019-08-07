import seeder.ArticleSeeder;
import seeder.CategorySeeder;

public class UnitTestMain {
    public static void main(String args[]) {
//        String s1 = "/viettuts.vn/java-string/phuong-thuc-split";
//        String[] words = s1.split("/");//tach chuoi dua tren khoang trang
//        //su dung vong lap foreach de in cac element cua mang chuoi thu duoc
//        for (String w : words) {
//            System.out.println("a"+w);
//        }
        CategorySeeder.run();
        ArticleSeeder.run();
    }

}
