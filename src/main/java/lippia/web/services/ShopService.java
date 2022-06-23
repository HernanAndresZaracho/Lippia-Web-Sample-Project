package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.HomeConstants;
import lippia.web.constants.ShopConstants;

public class ShopService extends ActionManager{
    public static void clickAddHTMLForms(){
        click(ShopConstants.BTN_HTML_FORMS_ADD_XPATH);
    }

}
