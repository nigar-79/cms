-- Table: base.role

-- DROP TABLE IF EXISTS base.role;

CREATE TABLE IF NOT EXISTS base.role_menu
(
    role_menu_id integer NOT NULL DEFAULT nextval('base.role_menu_role_menu_id'::regclass),
	menu_sequence integer,
	menu_id integer NOT NULL,
	role_id integer NOT NULL,
    active character varying(20) COLLATE pg_catalog."default",
    created_by character varying(50) COLLATE pg_catalog."default",
    created_time timestamp with time zone DEFAULT CURRENT_TIMESTAMP,
    updated_by character varying(50) COLLATE pg_catalog."default",
    updated_time timestamp with time zone DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT role_menu_pkey PRIMARY KEY (role_menu_id),
    CONSTRAINT role_menu_menu_id_fkey FOREIGN KEY (menu_id)
        REFERENCES base.menu (menu_id),
	CONSTRAINT role_menu_role_id_fkey FOREIGN KEY (role_id)
        REFERENCES base.role (role_id)
);