package ma.formations.springmvcrestdatajpa.controller.rest;

import java.util.List;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ma.formations.springmvcrestdatajpa.domaine.EmpVo;
import ma.formations.springmvcrestdatajpa.service.IService;

@RestController
public class EmpRestController {

    @Autowired
    private IService service;

    @GetMapping(value = "/rest/emp", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
    public List<EmpVo> getAll() {
        return service.getEmployees();
    }

    @GetMapping(value = "/rest/emp/{id}")
    public ResponseEntity<Object> getEmpById(@PathVariable("id") Long EmpVoId) {
        EmpVo EmpVoFound = service.getEmpById(EmpVoId);
        if (EmpVoFound == null) {
            return new ResponseEntity<>("employee doesn't exist", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(EmpVoFound, HttpStatus.OK);
    }

    @PostMapping(value = "/rest/emp")
    public ResponseEntity<Object> createEmp(@Valid @RequestBody EmpVo EmpVo) {
        service.save(EmpVo);
        return new ResponseEntity<>("employee is created successfully", HttpStatus.CREATED);
    }

    @PutMapping(value = "/rest/emp/{id}")
    public ResponseEntity<Object> updateEmp(@PathVariable("id") Long EmpVoId, @RequestBody EmpVo EmpVo) {
        EmpVo EmpVoFound = service.getEmpById(EmpVoId);
        if (EmpVoFound == null) {
            return new ResponseEntity<>("employee doesn't exist", HttpStatus.NOT_FOUND);
        }
        EmpVo.setId(EmpVoId);
        service.save(EmpVo);
        return new ResponseEntity<>("employee is updated successfully", HttpStatus.OK);
    }

    @DeleteMapping(value = "/rest/emp/{id}")
    public ResponseEntity<Object> deleteEmp(@PathVariable("id") Long EmpVoId) {
        EmpVo EmpVoFound = service.getEmpById(EmpVoId);
        if (EmpVoFound == null) {
            return new ResponseEntity<>("employee doesn't exist", HttpStatus.NOT_FOUND);
        }
        service.delete(EmpVoId);
        return new ResponseEntity<>("employee is deleted successfully", HttpStatus.OK);
    }

    @GetMapping(value = "/rest/sort/{fieldName}", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
    public List<EmpVo> sortBy(@PathVariable String fieldName) {
        return service.sortBy(fieldName);
    }

    @GetMapping("/rest/pagination/{pageid}/{size}")
    public List<EmpVo> pagination(@PathVariable int pageid, @PathVariable int size) {
        return service.findAll(pageid, size);
    }
}