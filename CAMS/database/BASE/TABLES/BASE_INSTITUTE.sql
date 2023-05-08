-- Table: base.instituteanization

-- DROP TABLE IF EXISTS base.instituteanization;

CREATE TABLE IF NOT EXISTS base.institute
(
    institute_code character varying(20) COLLATE pg_catalog."default" NOT NULL,
    institute_name character varying(100) COLLATE pg_catalog."default" NOT NULL,
    institute_type character varying(100) COLLATE pg_catalog."default" NOT NULL,
    description character varying(2000) COLLATE pg_catalog."default" NOT NULL,
    contact_person_salutation character varying(10) COLLATE pg_catalog."default" NOT NULL,
    contact_person_name character varying(100) COLLATE pg_catalog."default" NOT NULL,
    contact_person_email_id character varying(400) COLLATE pg_catalog."default",
    contact_person_phone_no character varying(200) COLLATE pg_catalog."default",
	password_expiry_days integer NOT NULL default 30,
	password_expiry_notify_days integer NOT NULL default 15,
	max_login_fail_count integer NOT NULL default 3,
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
    institute_start_date date NOT NULL,
    area_in_acres double precision,
    ACTIVE character varying(20) COLLATE pg_catalog."default",
    created_by character varying(50) COLLATE pg_catalog."default",
    created_time timestamp with time zone DEFAULT CURRENT_TIMESTAMP,
    updated_by character varying(50) COLLATE pg_catalog."default",
    updated_time timestamp with time zone DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT institute_code_pkey PRIMARY KEY (institute_code),
    CONSTRAINT institute_name_uk UNIQUE (institute_name)
);