package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Client;
import com.example.demo.model.ContactForm;
import com.example.demo.model.Subscriber;
import com.example.demo.service.ClientService;
import com.example.demo.service.ContactService;
import com.example.demo.service.SubscriberService;

@Controller
public class AdminController {

    @Autowired
    private ClientService clientService;

    @Autowired
    private ContactService contactService;

    @Autowired
    private SubscriberService subscriberService;

    @GetMapping("/admin/clients")
    public String showClientsPage(Model model) {
        model.addAttribute("clients", clientService.getAllClients());
        model.addAttribute("client", new Client());
        return "admin/clients";
    }

    @PostMapping("/admin/clients")
    public String saveClient(@ModelAttribute Client client) {
        clientService.saveClient(client);
        return "redirect:/admin/clients";
    }

    @GetMapping("/admin/contacts")
    public String showContactsPage(Model model) {
        model.addAttribute("contacts", contactService.getAllContacts());
        return "admin/contacts";
    }

    @GetMapping("/admin/subscribers")
    public String showSubscribersPage(Model model) {
        model.addAttribute("subscribers", subscriberService.getAllSubscribers());
        return "admin/subscribers";
    }

    @PostMapping("/contact")
    public String submitContact(@ModelAttribute ContactForm contact) {
        contactService.saveContact(contact);
        return "redirect:/";
    }

      @PostMapping("/contactupdate")
    public String updateCon(@ModelAttribute ContactForm contact) {
        contactService.saveContact(contact);
        return "redirect:/admin/contacts";
    }

    @PostMapping("/subscribe")
    public String submitSubscriber(@RequestParam String email) {
        Subscriber sub = new Subscriber();
        sub.setEmail(email);
        subscriberService.saveSubscriber(sub);
        return "redirect:/";
    }

      @GetMapping("/showFormForUpdate/{id}")
    public String updateForm(@PathVariable(value = "id") long id, Model model) {
        ContactForm cont = contactService.getById(id);
        model.addAttribute("contact", cont);
        return "admin/updateContact";
    }

    @GetMapping("/deleteEmployee/{id}")
    public String deleteThroughId(@PathVariable(value = "id") long id) {
        contactService.deleteViaId(id);
        return "redirect:/";

    }
}
