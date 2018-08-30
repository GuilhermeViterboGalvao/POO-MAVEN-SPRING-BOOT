package br.curso.poo.springBoot.service.impl;

import br.curso.poo.springBoot.service.HistoryService;
import br.curso.poo.springBoot.service.exception.HistoryException;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HistoryServiceImpl implements HistoryService {

    @Override
    public void add(String calculation) throws HistoryException {
        if (calculation != null && !calculation.isEmpty()) {
            DB.add(calculation);
        } else {
            throw new HistoryException("Calculation is null or empty");
        }
    }

    @Override
    public void remove(String calculation) throws HistoryException {
        if (calculation != null && !calculation.isEmpty()) {
            DB.remove(calculation);
        } else {
            throw new HistoryException("Calculation is null or empty");
        }
    }

    @Override
    public List<String> getHistory() {
        return DB;
    }
}
