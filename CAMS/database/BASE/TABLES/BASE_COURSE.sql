-- Table: cms.course

-- DROP TABLE IF EXISTS base.course;

CREATE TABLE IF NOT EXISTS base.course
(
    course_id integer NOT NULL DEFAULT nextval('base.course_course_id'::regclass),
    institute_code character varying(20) COLLATE pg_catalog."default" NOT NULL,
	branch_code character varying(20) COLLATE pg_catalog."default" NOT NULL,
    graduation_program_id integer COLLATE pg_catalog."default" NOT NULL,
    course_name character varying(200) COLLATE pg_catalog."default" NOT NULL,
    duration integer NOT NULL,
    description character varying(500) COLLATE pg_catalog."default" NOT NULL,
    added_date date NOT NULL,
    status character varying(20) COLLATE pg_catalog."default",
    created_by character varying(50) COLLATE pg_catalog."default",
    created_time timestamp with time zone,
    updated_by character varying(50) COLLATE pg_catalog."default",
    updated_time timestamp with time zone,
    CONSTRAINT course_id_pkey PRIMARY KEY (course_id),
    CONSTRAINT course_graduation_program_id_fkey FOREIGN KEY (graduation_program_id)
        REFERENCES base.graduation_program (graduation_program_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
	    CONSTRAINT course_branch_code_fkey FOREIGN KEY (branch_code)
        REFERENCES base.branch (branch_code),
    CONSTRAINT course_institute_code_fkey FOREIGN KEY (institute_code)
        REFERENCES base.institute (institute_code) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);