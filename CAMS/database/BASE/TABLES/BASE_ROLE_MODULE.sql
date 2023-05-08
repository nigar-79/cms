CREATE TABLE IF NOT EXISTS base.role_module
(
    role_module_id integer NOT NULL DEFAULT nextval('base.role_module_role_module_id'::regclass),
	create_flag boolean,
	delete_flag boolean,
	edit_flag boolean,
	read_flag boolean,
	module_id integer NOT NULL,
	role_id integer NOT NULL,
    institute_code character varying(20) COLLATE pg_catalog."default" NOT NULL,	
    active character varying(20) COLLATE pg_catalog."default",
    created_by character varying(50) COLLATE pg_catalog."default",
    created_time timestamp with time zone DEFAULT CURRENT_TIMESTAMP,
    updated_by character varying(50) COLLATE pg_catalog."default",
    updated_time timestamp with time zone DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT role_module_pkey PRIMARY KEY (role_module_id),
	CONSTRAINT graduation_program_institute_code_fkey FOREIGN KEY (institute_code)
        REFERENCES base.institute (institute_code),
    CONSTRAINT role_module_module_id_fkey FOREIGN KEY (module_id)
        REFERENCES base.module (module_id),
	CONSTRAINT role_module_role_id_fkey FOREIGN KEY (role_id)
        REFERENCES base.role (role_id)
);