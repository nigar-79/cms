-- Table: base.bank_details

-- DROP TABLE IF EXISTS base.bank_details;

CREATE TABLE IF NOT EXISTS base.bank_details
(
    bank_id integer NOT NULL DEFAULT nextval('base.bank_details_bank_id'::regclass),
	institute_code character varying(20) COLLATE pg_catalog."default" NOT NULL,
    branch_code character varying(20) COLLATE pg_catalog."default" NOT NULL,
    bank_code character varying(50) COLLATE pg_catalog."default" NOT NULL,
    bank_account character varying(50) COLLATE pg_catalog."default" NOT NULL,
    account_holder character varying(50) COLLATE pg_catalog."default" NOT NULL,
    bank_key character varying(50) COLLATE pg_catalog."default" NOT NULL,
    vat_reg_no character varying(50) COLLATE pg_catalog."default" NOT NULL,
    vat_reg_no2 character varying(50) COLLATE pg_catalog."default",
    vat_reg_no3 character varying(50) COLLATE pg_catalog."default",
    bank_name character varying(100) COLLATE pg_catalog."default" NOT NULL,
    branch character varying(100) COLLATE pg_catalog."default" NOT NULL,
    address1 character varying(500) COLLATE pg_catalog."default" NOT NULL,
    address2 character varying(500) COLLATE pg_catalog."default",
    address3 character varying(500) COLLATE pg_catalog."default",
    city character varying(50) COLLATE pg_catalog."default" NOT NULL,
    state character varying(50) COLLATE pg_catalog."default" NOT NULL,
    country character varying(50) COLLATE pg_catalog."default" NOT NULL,
    counry_code character varying(50) COLLATE pg_catalog."default" NOT NULL,
    postal_code character varying(50) COLLATE pg_catalog."default" NOT NULL,
    active character varying(20) COLLATE pg_catalog."default",
    created_by character varying(50) COLLATE pg_catalog."default",
    created_time timestamp with time zone DEFAULT CURRENT_TIMESTAMP,
    updated_by character varying(50) COLLATE pg_catalog."default",
    updated_time timestamp with time zone DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT bank_id_pkey PRIMARY KEY (bank_id),
    CONSTRAINT bank_account_uk UNIQUE (bank_code, bank_account),
	 CONSTRAINT graduation_program_institute_code_fkey FOREIGN KEY (institute_code)
        REFERENCES base.institute (institute_code),
	 CONSTRAINT graduation_program_branch_code_fkey FOREIGN KEY (branch_code)
        REFERENCES base.branch (branch_code)
);