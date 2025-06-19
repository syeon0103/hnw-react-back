CREATE SCHEMA IF NOT EXISTS com;

CREATE TABLE IF NOT EXISTS com.hnw_user (
                                          id SERIAL PRIMARY KEY,
                                          user_name VARCHAR(255) NOT NULL
    );
