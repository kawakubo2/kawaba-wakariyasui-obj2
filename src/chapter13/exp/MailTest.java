package chapter13.exp;

public class MailTest {
    public static void main(String[] args) {
        try {
            LessonRecord.getLessonRecord();
            PDFCreator.create();
            MailSender.send();
        } catch (LessonRecordException e) {
            System.out.println(e);
        } catch (PDFException e) {
            System.out.println(e);
        } catch (MailException e) {
            System.out.println(e);
        }
    }
}
