
create table if not exists base.menu (
	menu_id integer NOT NULL DEFAULT NEXTVAL('BASE.MENU_MENU_ID'::regclass),
	key character varying(100),
	icon_name character varying(100),
	menu_routing_path character varying(300),
	user_type character varying(50),
	institute_code character varying(20) COLLATE pg_catalog."default" NOT NULL,
	active character varying(20),
    created_by character varying(50),
    created_time timestamp with time zone DEFAULT CURRENT_TIMESTAMP,
    updated_by character varying(50),
    updated_time timestamp with time zone DEFAULT CURRENT_TIMESTAMP,
	CONSTRAINT menu_id_pkey PRIMARY KEY (menu_id),
    CONSTRAINT key_user_type_uk UNIQUE (key, user_type),
	CONSTRAINT graduation_program_institute_code_fkey FOREIGN KEY (institute_code)
        REFERENCES base.institute (institute_code)
);