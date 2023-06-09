package org.example.repository;

import org.example.entity.Author;

import java.sql.SQLException;

public interface AuthorRepository {

    int save(Author author) throws SQLException;

    Author load(int authorId) throws SQLException;
}

