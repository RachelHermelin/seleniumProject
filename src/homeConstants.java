import org.openqa.selenium.By;

public class homeConstants {
    public static final By chooseSumBox=(By.xpath("//span[.='סכום']"));
    public static final By chooseSumDrop=(By.className("active-result"));
    public static final By chooseAreaBox=(By.xpath("//span[.='אזור']"));
    public static final By chooseAreaDrop=(By.className("active-result"));
    public static final By chooseCategoryBox=(By.xpath("//span[.='קטגוריה']"));
    public static final By chooseCategoryDrop=(By.className("active-result"));
    public static final By findPresentButton=(By.xpath("//button[@type='submit'] "));
}
