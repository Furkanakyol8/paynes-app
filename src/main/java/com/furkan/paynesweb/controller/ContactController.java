package com.furkan.paynesweb.controller;

import com.furkan.paynesweb.model.entity.ContactMessage;
import com.furkan.paynesweb.service.ContactMessageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ContactController {

    private final ContactMessageService contactMessageService;

    public ContactController(ContactMessageService contactMessageService) {
        this.contactMessageService = contactMessageService;
    }

    @GetMapping("/iletisim")
    public String showContactForm(Model model) {
        model.addAttribute("contactMessage", new ContactMessage());
        model.addAttribute("activePage", "iletisim");
        return "contact";
    }

    @PostMapping("/iletisim")
    public String submitContactForm(@ModelAttribute("contactMessage") ContactMessage contactMessage, Model model) {
        contactMessageService.saveMessage(contactMessage);
        model.addAttribute("success", true);
        model.addAttribute("contactMessage", new ContactMessage());
        return "contact";
    }
}
