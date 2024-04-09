import org.openqa.selenium.By;

public class NoteHelper extends HelperBase {
    ApplicationManager manager;
    public NoteHelper(ApplicationManager manager) {
        super(manager);
//        this.manager = manager;
    }

    public void SaveBtn() {
        driver.findElement(By.id("btn_save")).click();
    }

    public void KeuWordEdit() {
        driver.findElement(By.name("Word[]")).sendKeys(groupData.getKeyWord());
    }

    public void KeuWordClick(){
        driver.findElement(By.name("Word[]")).click();
    }

    public void TextEdit() {
        driver.findElement(By.id("DiText")).sendKeys(groupData.getAddText());
    }

    public void TextEditCkick() {
        driver.findElement(By.id("DiText")).click();
    }

}
