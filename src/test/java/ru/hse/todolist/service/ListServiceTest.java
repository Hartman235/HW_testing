package ru.hse.todolist.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.hse.todolist.repository.Repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ListServiceTest {
    @Mock
    private Repository repository;
    @InjectMocks
    private ListService listService;

    @Test
    void addTask__serviceIsCalled() {
        when(repository.getTask("first")).thenReturn("firstVal");

        String text = listService.getTask("first");
        assertEquals("firstVal", text);
        verify(repository, times(1)).getTask("first");
    }
}
