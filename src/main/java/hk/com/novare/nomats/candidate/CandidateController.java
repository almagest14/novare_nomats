package hk.com.novare.nomats.candidate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CandidateController {

	@RequestMapping(value = "candidates")
	public String candidates() {
        return "candidates/candidates";
    }
}
