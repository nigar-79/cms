-- Table: base.department

-- DROP TABLE IF EXISTS base.department;

CREATE TABLE IF NOT EXISTS base.department
(
    department_id character varying(20) COLLATE pg_catalog."default" NOT NULL DEFAULT nextval('base.department_department_id'::regclass),
    institute_code character varying(20) COLLATE pg_catalog."default" NOT NULL,
	branch_code character varying(20) COLLATE pg_catalog."default" NOT NULL,
    department_name character varying(100) COLLATE pg_catalog."default" NOT NULL,
    description character varying(2000) COLLATE pg_catalog."default" NOT NULL,
    status character varying(20) COLLATE pg_catalog."default",
    created_by character varying(50) COLLATE pg_catalog."default",
    created_time timestamp with time zone,
    updated_by character varying(50) COLLATE pg_catalog."default",
    updated_time timestamp with time zone,
    CONSTRAINT department_id_pkey PRIMARY KEY (department_id),
    CONSTRAINT department_name_uk UNIQUE (department_name),
	CONSTRAINT department_institute_code_fkey FOREIGN KEY (institute_code)
        REFERENCES base.institute (institute_code)
    CONSTRAINT department_branch_code_fkey FOREIGN KEY (branch_code)
        REFERENCES base.branch (branch_code) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);