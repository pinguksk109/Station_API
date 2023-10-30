USE station_api;

-- DROP TABLE company;

CREATE TABLE company (
    company_cd INT PRIMARY KEY,
    rr_cd INT,
    company_name VARCHAR(30),
    company_name_k VARCHAR(30),
    company_name_h VARCHAR(30),
    company_name_r VARCHAR(30),
    company_url VARCHAR(100),
    company_type INT,
    e_status INT,
    e_sort INT
);