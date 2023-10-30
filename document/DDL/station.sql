USE station_api;

-- DROP TABLE station;

CREATE TABLE IF NOT EXISTS station (
    station_cd INT NOT NULL PRIMARY KEY,
    station_g_cd INT,
    station_name VARCHAR(30),
    station_name_k VARCHAR(255),
    station_name_r VARCHAR(255),
    line_cd INT,
    pref_cd INT,
    post VARCHAR(10),
    address VARCHAR(255),
    lon NUMERIC(10, 6),
    lat NUMERIC(10, 6),
    open_ymd VARCHAR(10),
    close_ymd VARCHAR(10),
    e_status INT,
    e_sort INT
);