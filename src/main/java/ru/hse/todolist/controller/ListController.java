package ru.hse.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListController {

    @GetMapping
    public String getTask(@RequestParam String title) {
        return null;
    }

    @PostMapping
    public void addTask(String title, String task) {

    }

    public void deleteTask(String title) {

    }
}
