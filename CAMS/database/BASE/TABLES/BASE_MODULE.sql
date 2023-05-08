create table if not exists base.module (
	module_id integer NOT NULL DEFAULT NEXTVAL('BASE.MODULE_MODULE_ID'::regclass),
	key character varying(100),
	description character varying(300),
	module_group_name character varying(100),
	module_routing_path character varying(300),
	module_key character varying(100),
	module_type character varying(50),
	icon_name character varying(100),
	parent_module_id integer,
	displayed_on_ui boolean default false,
	user_type character varying(50),
	institute_code character varying(20) COLLATE pg_catalog."default" NOT NULL,
	active character varying(20),
    created_by character varying(50),
    created_time timestamp with time zone DEFAULT CURRENT_TIMESTAMP,
    updated_by character varying(50),
    updated_time timestamp with time zone DEFAULT CURRENT_TIMESTAMP,
	CONSTRAINT module_id_pkey PRIMARY KEY (module_id)
);