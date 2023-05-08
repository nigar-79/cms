-- Table: base.graduation_program

-- DROP TABLE IF EXISTS base.graduation_program;

CREATE TABLE IF NOT EXISTS base.graduation_program
(
    graduation_program_id character varying(50) COLLATE pg_catalog."default" NOT NULL,
    graduation_name character varying(100) COLLATE pg_catalog."default" NOT NULL,
    graduation_type_added_date date NOT NULL,
    description character varying(2000) COLLATE pg_catalog."default" NOT NULL,
    institute_code character varying(20) COLLATE pg_catalog."default" NOT NULL,
    branch_code character varying(20) COLLATE pg_catalog."default" NOT NULL,
    status character varying(20) COLLATE pg_catalog."default",
    created_by character varying(50) COLLATE pg_catalog."default",
    created_time timestamp with time zone,
    updated_by character varying(50) COLLATE pg_catalog."default",
    updated_time timestamp with time zone,
    CONSTRAINT graduation_program_id_pkey PRIMARY KEY (graduation_program_id),
      CONSTRAINT graduation_program_branch_code_fkey FOREIGN KEY (branch_code)
        REFERENCES base.branch (branch_code),
    CONSTRAINT graduation_program_institute_code_fkey FOREIGN KEY (institute_code)
        REFERENCES base.institute (institute_code) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);