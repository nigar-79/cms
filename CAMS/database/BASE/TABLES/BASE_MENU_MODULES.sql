create table if not exists base.menu_modules (
	menu_modules_id integer NOT NULL DEFAULT NEXTVAL('base.menu_modules_menu_modules_id'::regclass),
	module_sequence integer,
	module_id integer NOT NULL,
	menu_id integer NOT NULL,
	active character varying(20) COLLATE pg_catalog."default",
    created_by character varying(50) COLLATE pg_catalog."default",
    created_time timestamp with time zone DEFAULT CURRENT_TIMESTAMP,
    updated_by character varying(50) COLLATE pg_catalog."default",
    updated_time timestamp with time zone DEFAULT CURRENT_TIMESTAMP,
	CONSTRAINT menu_modules_id_pkey PRIMARY KEY (menu_modules_id),
	CONSTRAINT menu_modules_module_id_fkey FOREIGN KEY (module_id)
        REFERENCES base.module (module_id),
	CONSTRAINT menu_modules_menu_id_fkey FOREIGN KEY (menu_id)
        REFERENCES base.menu (menu_id)
);