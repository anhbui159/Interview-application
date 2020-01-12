package com.bfs.backend.service;

import com.bfs.backend.domain.User1;

import java.util.List;

public interface UserService {
    User1 getUserByNameOrEmail(String str, String nameOrEmail);
}