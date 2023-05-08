-- Table: base.student_admission

-- DROP TABLE IF EXISTS base.student_admission;

CREATE TABLE IF NOT EXISTS base.student_admission
(
    admission_id character varying(50) DEFAULT nextval('base.student_admission_admission_id'::regclass),
    institute_code character varying(50) COLLATE pg_catalog."default" NOT NULL,
	branch_code character varying(50) COLLATE pg_catalog."default" NOT NULL,
    graduation_program_id integer NOT NULL, 
    course_id character varying(50) COLLATE pg_catalog."default" NOT NULL,
    department_id character varying(50) COLLATE pg_catalog."default" NOT NULL,
    salutation character varying(10) COLLATE pg_catalog."default" NOT NULL,
    first_name character varying(100) COLLATE pg_catalog."default" NOT NULL,
    middle_name character varying(100) COLLATE pg_catalog."default" NOT NULL,
    last_name character varying(100) COLLATE pg_catalog."default" NOT NULL,
    dob date,
    age character varying(10) COLLATE pg_catalog."default" NOT NULL,
    gender character varying(10) COLLATE pg_catalog."default" NOT NULL,
    phone_number character varying(50) COLLATE pg_catalog."default" NOT NULL,
    email_id character varying(50) COLLATE pg_catalog."default" NOT NULL,
    current_address1 character varying(200) COLLATE pg_catalog."default" NOT NULL,
    current_address2 character varying(200) COLLATE pg_catalog."default" NOT NULL,
    current_address3 character varying(200) COLLATE pg_catalog."default" NOT NULL,
    permanent_address1 character varying(200) COLLATE pg_catalog."default" NOT NULL,
    permanent_address2 character varying(200) COLLATE pg_catalog."default" NOT NULL,
    permanent_address3 character varying(200) COLLATE pg_catalog."default" NOT NULL,
    city character varying(50) COLLATE pg_catalog."default" NOT NULL,
    state character varying(50) COLLATE pg_catalog."default" NOT NULL,
    country character varying(50) COLLATE pg_catalog."default" NOT NULL,
    postal_code character varying(10) COLLATE pg_catalog."default" NOT NULL,
    status character varying(20) COLLATE pg_catalog."default",
    created_by character varying(50) COLLATE pg_catalog."default",
    created_time timestamp with time zone,
    updated_by character varying(50) COLLATE pg_catalog."default",
    updated_time timestamp with time zone,
    CONSTRAINT admission_id_pkey PRIMARY KEY (admission_id),
     CONSTRAINT course_graduation_program_id_fkey FOREIGN KEY (graduation_program_id)
        REFERENCES base.graduation_program (graduation_program_id)
    CONSTRAINT student_admission_course_id_fkey FOREIGN KEY (course_id)
        REFERENCES base.course (course_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT student_admission_department_id_fkey FOREIGN KEY (department_id)
        REFERENCES base.department (department_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
	CONSTRAINT student_admission_branch_code_fkey FOREIGN KEY (branch_code)
        REFERENCES base.branch (branch_code),
    CONSTRAINT student_admission_institute_code_fkey FOREIGN KEY (institute_code)
        REFERENCES base.institute (institute_code) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);