CREATE TABLE IF NOT EXISTS public.student
(
    id integer NOT NULL,
    address character varying(255),
    email character varying(255),
    name character varying(255),
    CONSTRAINT student_pkey PRIMARY KEY (id)
);

INSERT INTO STUDENT(ID, NAME, ADDRESS, EMAIL) VALUES('1','Jack','Dallas, TX','jack@gmail.com');