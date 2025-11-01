package ma.formations.springmvcrestdatajpa.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ma.formations.springmvcrestdatajpa.domaine.EmpVo;
import ma.formations.springmvcrestdatajpa.service.IService;

@Controller
public class EmpController {

    @Autowired
    private IService service;

    @RequestMapping("/")
    public String showWelcomeFile(Model m) {
        return "index";
    }

    @RequestMapping("/empform")
    public String showform(Model m) {
        m.addAttribute("EmpVo", new EmpVo());
        return "empform";
    }

    /**
     * 1\) Au niveau du formulaire `empform.jsp`, lorsqu'on clique sur le bouton Submit,
     * l'action `/save` sera exécutée. Les valeurs du formulaires seront passées dans l'objet `EmpVo`.
     * 2\) la méthode `save()` de l'interface `IService` sera lancée.
     * 3\) Ensuite la réponse sera redirigée vers la page `/WEB-INF/vues/viewemp.jsp`.
     */
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@ModelAttribute("EmpVo") EmpVo emp) {
        service.save(emp);
        return "redirect:/viewemp";
    }

    @RequestMapping("/viewemp")
    public String viewemp(Model m) {
        List<EmpVo> list = service.getEmployees();
        m.addAttribute("list", list);
        return "viewemp";
    }

    @RequestMapping(value = "/editemp/{id}")
    public String edit(@PathVariable Long id, Model m) {
        EmpVo emp = service.getEmpById(id);
        m.addAttribute("EmpVo", emp);
        return "empeditform";
    }

    @RequestMapping(value = "/editsave", method = RequestMethod.POST)
    public String editsave(@ModelAttribute("EmpVo") EmpVo emp) {
        service.save(emp);
        return "redirect:/viewemp";
    }

    @RequestMapping(value = "/deleteemp/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/viewemp";
    }

    @RequestMapping("/salary/{salary}")
    public String getBySalary(@PathVariable Double salary, Model m) {
        List<EmpVo> list = service.findBySalary(salary);
        m.addAttribute("list", list);
        return "viewemp";
    }

    @RequestMapping("/fonction/{fonction}")
    public String getByFonction(@PathVariable String fonction, Model m) {
        List<EmpVo> list = service.findByFonction(fonction);
        m.addAttribute("list", list);
        return "viewemp";
    }

    @RequestMapping("/salary_and_fonction/{salary}/{fonction}")
    public String getBySalaryAndFonction(@PathVariable Double salary,
                                         @PathVariable String fonction,
                                         Model m) {
        List<EmpVo> list = service.findBySalaryAndFonction(salary, fonction);
        m.addAttribute("list", list);
        return "viewemp";
    }

    @RequestMapping("/max_salary")
    public String getMaxSalary(Model m) {
        EmpVo EmpVo = service.getEmpHavaingMaxSalary();
        List<EmpVo> list = new ArrayList<>();
        list.add(EmpVo);
        m.addAttribute("list", list);
        return "viewemp";
    }

    @RequestMapping("/pagination/{pageid}/{size}")
    public String pagination(@PathVariable int pageid, @PathVariable int size, Model m) {
        List<EmpVo> list = service.findAll(pageid, size);
        m.addAttribute("list", list);
        return "viewemp";
    }

    @RequestMapping("/sort/{fieldName}")
    public String sortBy(@PathVariable String fieldName, Model m) {
        List<EmpVo> list = service.sortBy(fieldName);
        m.addAttribute("list", list);
        return "viewemp";
    }
}