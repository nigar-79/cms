-- Table: base.branch

-- DROP TABLE IF EXISTS base.branch;

CREATE TABLE IF NOT EXISTS base.branch
(
    institute_code character varying(20) COLLATE pg_catalog."default" NOT NULL,
    branch_code character varying(20) COLLATE pg_catalog."default" NOT NULL,
    branch_name character varying(100) COLLATE pg_catalog."default" NOT NULL,
    branch_type character varying(100) COLLATE pg_catalog."default" NOT NULL,
    description character varying(2000) COLLATE pg_catalog."default" NOT NULL,
    contact_person_salutation character varying(10) COLLATE pg_catalog."default" NOT NULL,
    contact_person_name character varying(100) COLLATE pg_catalog."default" NOT NULL,
    contact_person_email_id character varying(400) COLLATE pg_catalog."default",
    contact_person_phone_no character varying(200) COLLATE pg_catalog."default",
    password_expiry_days integer NOT NULL DEFAULT 30,
    password_expiry_notify_days integer NOT NULL DEFAULT 15,
    max_login_fail_count integer NOT NULL DEFAULT 3,
    web_url character varying(255) COLLATE pg_catalog."default",
    logo_path character varying(255) COLLATE pg_catalog."default",
    address_line1 character varying(500) COLLATE pg_catalog."default" NOT NULL,
    address_line2 character varying(500) COLLATE pg_catalog."default",
    address_line3 character varying(500) COLLATE pg_catalog."default",
    city character varying(50) COLLATE pg_catalog."default" NOT NULL,
    state character varying(50) COLLATE pg_catalog."default" NOT NULL,
    country character varying(50) COLLATE pg_catalog."default" NOT NULL,
    country_code character varying(50) COLLATE pg_catalog."default" NOT NULL,
    postal_code character varying(50) COLLATE pg_catalog."default" NOT NULL,
    tel_no character varying(50) COLLATE pg_catalog."default" NOT NULL,
    fax_no character varying(50) COLLATE pg_catalog."default",
    branch_start_date date NOT NULL,
    area_in_acres double precision,
    active character varying(20) COLLATE pg_catalog."default",
    created_by character varying(50) COLLATE pg_catalog."default",
    created_time timestamp with time zone DEFAULT CURRENT_TIMESTAMP,
    updated_by character varying(50) COLLATE pg_catalog."default",
    updated_time timestamp with time zone DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT branch_code_pkey PRIMARY KEY (branch_code),
    CONSTRAINT branch_name_uk UNIQUE (institute_code, branch_code),
       CONSTRAINT graduation_program_institute_code_fkey FOREIGN KEY (institute_code)
        REFERENCES base.institute (institute_code)
);
