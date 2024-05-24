package ru.hse.todolist.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.hse.todolist.repository.Repository;

@Service
@AllArgsConstructor
public class ListService {
    private Repository listRepository;
    public String getTask(String title) {
        return listRepository.getTask(title);
    }

    public void addTask(String title, String task) {
        listRepository.addTask(title, task);
    }

    public void deleteTask(String title) {
        listRepository.deleteTask(title);
    }
}
