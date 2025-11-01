package ma.formations.springmvcrestdatajpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import ma.formations.springmvcrestdatajpa.dao.EmpRepository;
import ma.formations.springmvcrestdatajpa.domaine.EmpConverter;
import ma.formations.springmvcrestdatajpa.domaine.EmpVo;
import ma.formations.springmvcrestdatajpa.service.modele.Emp;

@Service
public class ServiceImpl implements IService, CommandLineRunner {
    @Autowired
    private EmpRepository empRepository;
    @Override
    public List<EmpVo> getEmployees() {
        List<Emp> list = empRepository.findAll();
        return EmpConverter.toListVo(list);
    }
    @Override
    public void save(EmpVo emp) {
        empRepository.save(EmpConverter.toBo(emp));
    }
    @Override
    public EmpVo getEmpById(Long id) {
        boolean trouve = empRepository.existsById(id);
        if (!trouve)
            return null;
        return EmpConverter.toVo(empRepository.getOne(id));
    }
    @Override
    public void delete(Long id) {
        empRepository.deleteById(id);
    }
    @Override
    public List<EmpVo> findBySalary(Double salaty) {
        List<Emp> list = empRepository.findBySalary(salaty);
        return EmpConverter.toListVo(list);
    }
    @Override
    public List<EmpVo> findByFonction(String fonction) {
        List<Emp> list = empRepository.findByFonction(fonction);
        return EmpConverter.toListVo(list);
    }
    @Override
    public List<EmpVo> findBySalaryAndFonction(Double salary, String fonction) {
        List<Emp> list = empRepository.findBySalaryAndFonction(salary, fonction);
        return EmpConverter.toListVo(list);
    }
    @Override
    public EmpVo getEmpHavaingMaxSalary() {
        return EmpConverter.toVo(empRepository.getEmpHavaingMaxSalary());
    }
    @Override
    public List<EmpVo> findAll(int pageId, int size) {
        Page<Emp> result = empRepository.findAll(PageRequest.of(pageId, size,
                Direction.ASC, "name"));
        return EmpConverter.toListVo(result.getContent());
    }
    @Override
    public List<EmpVo> sortBy(String fieldName) {
        return EmpConverter.toListVo(empRepository.findAll(Sort.by(fieldName)));
    }
    /**
     * Spring Boot lance cette méthode une fois l'application est démarré.
     */
    @Override
    public void run(String... args) throws Exception {
        empRepository.deleteAll();
        empRepository.save(new Emp("name1", 8500d, "Technicien"));
        empRepository.save(new Emp("name2", 8500d, "Technicien"));
        empRepository.save(new Emp("name3", 8500d, "Chauffeur"));
        empRepository.save(new Emp("name4", 8500d, "Comptable"));
        empRepository.save(new Emp("name5", 10000d, "Comptable"));
        empRepository.save(new Emp("name6", 15000d, "Chef de projet"));
        empRepository.save(new Emp("name7", 17500d, "Responsable du service"));
        empRepository.save(new Emp("name8", 10000d, "Comptable"));
    }
}