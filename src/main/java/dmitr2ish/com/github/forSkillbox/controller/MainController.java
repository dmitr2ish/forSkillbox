package dmitr2ish.com.github.forSkillbox.controller;

import dmitr2ish.com.github.forSkillbox.dto.Record;
import dmitr2ish.com.github.forSkillbox.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class MainController {

    private final RecordService service;
    private Logger logger;

    @Autowired
    public MainController(RecordService service, Logger logger) {
        this.service = service;
        this.logger = logger;
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
    }

    @GetMapping(value = "/")
    public ModelAndView mainPage() {
        return new ModelAndView("index")
                .addObject("record", new Record());
    }

    @PostMapping(value = "/")
    public String checkingRecord(@ModelAttribute @Valid Record record,
                                 BindingResult bindingResult,
                                 Model model) {
        if (bindingResult.hasErrors()) {
            logger.log(Level.INFO, "Binding result error");
            return "index";
        } else {
            model.addAttribute("record", record);
            service.add(record);
        }
        return "index";
    }

}

