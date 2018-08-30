package br.curso.poo.springBoot.service;

import br.curso.poo.springBoot.service.exception.HistoryException;

import java.util.ArrayList;
import java.util.List;

public interface HistoryService {

    List<String> DB = new ArrayList<>();

    void add(String calculo) throws HistoryException;

    void remove(String calculo) throws HistoryException;

    List<String> getHistory();
}
