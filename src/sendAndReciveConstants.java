import org.openqa.selenium.By;

public class sendAndReciveConstants {
    public static final By anotherPerson=(By.className("circle"));
    public static final By receiverName=(By.xpath("//input[@data-parsley-required-message='מי הזוכה המאושר? יש להשלים את שם המקבל/ת']"));
        public static final By senderName=(By.xpath("//input[@data-parsley-required-message='למי יגידו תודה? שכחת למלא את השם שלך']"));
      public static final By blessing=(By.xpath("//textarea[@placeholder='מזל טוב, תודה רבה או פשוט מלא אהבה? כאן כותבים מילים טובות ואיחולים שמחים, עד 100 תווים']"));
       public static final By picture=(By.name("fileUpload"));
    public static final By whatEvent=(By.xpath("//span[.='לאיזה אירוע?']"));
    public static final By whatEventDrop =(By.className("active-result"));
    public static final By afterPay=(By.xpath("//label[.='מיד אחרי התשלום']"));
    public static final By emailButton=(By.xpath("//span[.='במייל']"));
    public static final By emailAddress=(By.xpath("//input[@type='email']"));
    public static final By saveButton=(By.xpath("//button[.='שמירה']"));




}
