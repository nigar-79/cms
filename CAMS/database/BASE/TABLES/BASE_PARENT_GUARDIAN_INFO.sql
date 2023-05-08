-- Table: base.parent_or_guardian_info

-- DROP TABLE IF EXISTS base.parent_or_guardian_info;

CREATE TABLE IF NOT EXISTS base.parent_or_guardian_info
(
    parent_guardian_id integer NOT NULL DEFAULT nextval('base.parent_or_guardian_info_parent_guardian_id'::regclass),
    admission_id character varying(50) COLLATE pg_catalog."default" NOT NULL,
    salutation character varying(50) COLLATE pg_catalog."default" NOT NULL,
    first_name character varying(100) COLLATE pg_catalog."default" NOT NULL,
    middle_name character varying(100) COLLATE pg_catalog."default" NOT NULL,
    last_name character varying(100) COLLATE pg_catalog."default" NOT NULL,
    phone_no character varying(50) COLLATE pg_catalog."default" NOT NULL,
    email character varying(50) COLLATE pg_catalog."default" NOT NULL,
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
    CONSTRAINT parent_guardian_id_id_pkey PRIMARY KEY (parent_guardian_id),
    CONSTRAINT parent_or_guardian_info_admission_id_fkey FOREIGN KEY (admission_id)
        REFERENCES base.student_admission (admission_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);