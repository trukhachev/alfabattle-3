package com.trukhachev.elastic.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.trukhachev.elastic.dto.LoanDTO;
import com.trukhachev.elastic.dto.PersonDTO;
import com.trukhachev.elastic.dto.StatusDTO;
import com.trukhachev.elastic.persistence.entity.LoanEntity;
import com.trukhachev.elastic.persistence.entity.PersonEntity;
import com.trukhachev.elastic.persistence.repository.LoansRepository;
import com.trukhachev.elastic.persistence.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
@RequiredArgsConstructor
@Slf4j
public class LoanHandler {

    private final PersonRepository personRepository;
    private final LoansRepository loansRepository;

    public StatusDTO loadPersons() {

        File personFile = null;

        var om = new ObjectMapper();

        try {
            personFile = new File("/home/ubuntu/person.json");
            var person = om.readValue(personFile, PersonDTO.class);

            personRepository.save(convertPerson(person));
            return new StatusDTO().setStatus("OK");


        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;

    }

    public StatusDTO loadLoans() {
        File loansFile = null;

        var om = new ObjectMapper();

        try {
            loansFile = new File("/home/ubuntu/loans.json");
            var loans = om.readValue(loansFile, LoanDTO.class);

            loansRepository.save(convertLoan(loans));
            return new StatusDTO().setStatus("OK");


        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    private PersonEntity convertPerson(PersonDTO personDTO) {

        double salary = Double.parseDouble(personDTO.getSalary()) / 100;

        Date birthday = null;

        try {
            birthday = new SimpleDateFormat("dd/MM/yyyy").parse(personDTO.getBirthday());


        } catch (ParseException e) {
            e.printStackTrace();
        }

        return new PersonEntity().
                setBirthday(birthday).
                setSalary(salary).
                setGender(personDTO.getGender()).
                setDocId(personDTO.getDocId()).
                setFio(personDTO.getFio());
    }

    private LoanEntity convertLoan(LoanDTO loanDTO) {

        return new LoanEntity();
    }

}
