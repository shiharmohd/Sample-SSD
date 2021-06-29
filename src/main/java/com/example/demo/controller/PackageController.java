package com.example.demo.controller;
import com.example.demo.model.Package;
import com.example.demo.service.PackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PackageController {
  
    @Autowired
    private PackageService packageService;

    @RequestMapping("/read-package")
    public String showReadPackagePage(Model model) {
        model.addAttribute("packages", packageService.findAll());
        return "readpackage";
    }

    @RequestMapping("/create-package")
    public String showPackageCreatePage(Model model) {
        model.addAttribute("command", new Package());
        return "createpackage";
    }

    @RequestMapping(value = "/create-package", method = RequestMethod.POST)
    public String createPackage(@ModelAttribute("package") Package package1) {
        packageService.savePackage(package1);
        return "redirect:/read-package";
    }

    @RequestMapping(value = "/update-package/{id}")
    public String showUpdatePackagePage(@PathVariable int id, Model model) {
        model.addAttribute("id", id);
        model.addAttribute("command", packageService.findById(id).orElse(null));
        return "updatepackage";
    }

    @RequestMapping(value = "/update-package/{id}", method = RequestMethod.POST)
    public String updatePackage(@PathVariable int id, @ModelAttribute("package") Package package1) {
        packageService.updatePackage(id, package1);
        return "redirect:/read-package";
    }

    @RequestMapping(value = "/delete-package/{id}")
    public String deletePackage(@PathVariable int id) {
        packageService.deleteById(id);
        return "redirect:/read-package";
    }
}
