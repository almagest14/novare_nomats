package hk.com.novare.nomats.job;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JobController {

	@RequestMapping(value = "jobs")
	public String jobs() {
        return "jobs/jobs";
    }
}
