USE station_api;

-- DROP TABLE line;

CREATE TABLE line (
    line_cd INT PRIMARY KEY,
    company_cd INT,
    line_name VARCHAR(30),
    line_name_k VARCHAR(30),
    line_name_h VARCHAR(50),
    line_color_c VARCHAR(30),
    line_color_t VARCHAR(30),
    line_type INT,
    lon NUMERIC(18, 10),
    lat NUMERIC(18, 10),
    zoom INT,
    e_status INT,
    e_sort INT
);