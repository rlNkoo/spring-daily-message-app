-- DROP TABLE IF EXISTS DEVOTIONAL;

CREATE TABLE IF NOT EXISTS DEVOTIONAL (
    id INTEGER NOT NULL AUTO_INCREMENT,
    quote VARCHAR(255),
    author VARCHAR(255),
    image_path VARCHAR(255),
    content VARCHAR(5000),
    created_at TIMESTAMP,
    updated_at TIMESTAMP,
    published_at DATE,
    PRIMARY KEY (id)
);

-- DROP SEQUENCE IF EXISTS DEVOTIONAL_SEQ;
CREATE SEQUENCE IF NOT EXISTS DEVOTIONAL_SEQ
    START WITH 50
    INCREMENT BY 50
    MINVALUE 50
    MAXVALUE 9999
    NOCYCLE;