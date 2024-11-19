CREATE DATABASE flex_test;
USE flex_test;
CREATE TABLE ff_user(
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    role_id INT,
    FOREIGN KEY (role_id) REFERENCES ff_role(role_id)
);

CREATE TABLE ff_role(
    role_id INT AUTO_INCREMENT PRIMARY KEY,
    role_name VARCHAR(255) NOT NULL UNIQUE,
    role_description TEXT
);

CREATE TABLE ff_user_role(
    user_id INT NOT NULL,
    role_id INT NOT NULL,
    PRIMARY KEY (user_id, role_id),
    FOREIGN KEY (user_id) REFERENCES ff_user(user_id),
    FOREIGN KEY (role_id) REFERENCES ff_role(role_id)
);

CREATE TABLE ff_file(
    file_id INT AUTO_INCREMENT PRIMARY KEY,
    file_name VARCHAR(255) NOT NULL,
    storage_path VARCHAR(255) NOT NULL,
    file_size VARCHAR(20) NOT NULL,
    file_permission VARCHAR(50),
    notes TEXT,
    description TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    modified_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    is_deleted BOOLEAN DEFAULT FALSE,
    is_enabled BOOLEAN DEFAULT TRUE
);

CREATE TABLE ff_category(
    category_id INT AUTO_INCREMENT PRIMARY KEY,
    category_name VARCHAR(255) NOT NULL
);

CREATE TABLE ff_tag (
    tag_id INT AUTO_INCREMENT PRIMARY KEY,
    tag_name VARCHAR(255) NOT NULL
);

CREATE TABLE ff_file_version(
    version_id INT AUTO_INCREMENT PRIMARY KEY,
    file_id INT NOT NULL,
    version_number VARCHAR(50) NOT NULL,
    FOREIGN KEY (file_id) REFERENCES ff_file(file_id)
);

CREATE TABLE ff_download_stats(
    download_id INT AUTO_INCREMENT PRIMARY KEY,
    file_id INT NOT NULL,
    download_count INT DEFAULT 1,
    last_downloaded_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (file_id) REFERENCES ff_file(file_id)
);

CREATE TABLE ff_operation_logs(
    log_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL,
    file_id INT NOT NULL,
    operation_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    operation_description TEXT NOT NULL,
    FOREIGN KEY (user_id) REFERENCES ff_user(user_id),
    FOREIGN KEY (file_id) REFERENCES ff_file(file_id)
);