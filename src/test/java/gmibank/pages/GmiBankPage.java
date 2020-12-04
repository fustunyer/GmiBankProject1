package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class GmiBankPage {

    public GmiBankPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
