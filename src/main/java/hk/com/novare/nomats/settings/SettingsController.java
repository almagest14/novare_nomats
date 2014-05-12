package hk.com.novare.nomats.settings;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SettingsController {

	@RequestMapping(value = "settings")
	public String settings() {
        return "settings/settings";
    }
}
