package hk.com.novare.nomats.search;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SearchController {

    @RequestMapping(value = "search")
    public String about() {
        return "search/search";
    }

/*

    return "searchResults :: resultsList";

    @RequestMapping(value = "/guests/{surname}", method = RequestMethod.GET)
    public String showGuestList(Model model, @PathVariable("surname") String surname) {
        model.addAttribute("guests", hotelService.getGuestsList(surname));

        return "results :: resultsList";
    }

    @RequestMapping(value = "/guests", method = RequestMethod.GET)
    public String showGuestList(Model model) {
        model.addAttribute("guests", hotelService.getGuestsList());

        return "results :: resultsList";
    }*/
}
