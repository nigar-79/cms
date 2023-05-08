-- Table: base.user

-- DROP TABLE IF EXISTS base."user";

CREATE TABLE IF NOT EXISTS base."user"
(
    user_id integer NOT NULL DEFAULT nextval('base.user_user_id'::regclass),
    user_name character varying(100) COLLATE pg_catalog."default" NOT NULL,
    login_id character varying(100) COLLATE pg_catalog."default",
    password character varying(100) COLLATE pg_catalog."default",
    email_id character varying(100) COLLATE pg_catalog."default",
    phone_no character varying(100) COLLATE pg_catalog."default",
    valid_from_dt timestamp with time zone DEFAULT CURRENT_TIMESTAMP,
    valid_to_dt timestamp with time zone,
    account_locked boolean DEFAULT false,
    institute_code character varying(20) COLLATE pg_catalog."default" NOT NULL,
    branch_code character varying(20) COLLATE pg_catalog."default" NOT NULL,
    last_login timestamp with time zone,
    user_type character varying(100) COLLATE pg_catalog."default",
    allow_login boolean DEFAULT false,
    login_failed_count integer DEFAULT 0,
    is_super_user boolean DEFAULT false,
	active character varying(20) COLLATE pg_catalog."default",
    created_by character varying(50) COLLATE pg_catalog."default",
    created_time timestamp with time zone DEFAULT CURRENT_TIMESTAMP,
    updated_by character varying(50) COLLATE pg_catalog."default",
    updated_time timestamp with time zone DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT user_id_pkey PRIMARY KEY (user_id),
    CONSTRAINT login_id_uk UNIQUE (login_id),
    CONSTRAINT graduation_program_institute_code_fkey FOREIGN KEY (institute_code)
        REFERENCES base.institute (institute_code),
    CONSTRAINT graduation_program_branch_code_fkey FOREIGN KEY (branch_code)
        REFERENCES base.branch (branch_code)
);