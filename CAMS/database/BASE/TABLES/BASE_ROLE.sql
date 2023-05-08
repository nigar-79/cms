
create table if not exists base.role (
	role_id integer NOT NULL DEFAULT NEXTVAL('BASE.ROLE_ROLE_ID'::regclass),
	name character varying(50) NOT NULL,
	user_type character varying(50),
	institute_code character varying(20) COLLATE pg_catalog."default" NOT NULL,
    branch_code character varying(20) COLLATE pg_catalog."default" NOT NULL,
	active character varying(20) COLLATE pg_catalog."default",
    created_by character varying(50) COLLATE pg_catalog."default",
    created_time timestamp with time zone DEFAULT CURRENT_TIMESTAMP,
    updated_by character varying(50) COLLATE pg_catalog."default",
    updated_time timestamp with time zone DEFAULT CURRENT_TIMESTAMP,
	constraint role_id_pkey PRIMARY KEY (role_id),
	CONSTRAINT role_name_uk UNIQUE (name),
	CONSTRAINT graduation_program_institute_code_fkey FOREIGN KEY (institute_code)
    REFERENCES base.institute (institute_code),
    CONSTRAINT graduation_program_branch_code_fkey FOREIGN KEY (branch_code)
        REFERENCES base.branch (branch_code)
);