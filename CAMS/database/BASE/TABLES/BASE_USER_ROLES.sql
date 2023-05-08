create table if not exists base.user_roles (
	user_roles_id integer NOT NULL DEFAULT NEXTVAL('base.user_roles_user_roles_id'::regclass),
	user_id integer NOT NULL,
	role_id integer NOT NULL,
	active character varying(20) COLLATE pg_catalog."default",
    created_by character varying(50) COLLATE pg_catalog."default",
    created_time timestamp with time zone DEFAULT CURRENT_TIMESTAMP,
    updated_by character varying(50) COLLATE pg_catalog."default",
    updated_time timestamp with time zone DEFAULT CURRENT_TIMESTAMP,
	CONSTRAINT user_roles_id_pkey PRIMARY KEY (user_roles_id),
	CONSTRAINT user_roles_user_id_fkey FOREIGN KEY (user_id)
        REFERENCES base.user (user_id),
	CONSTRAINT user_roles_role_id_fkey FOREIGN KEY (role_id)
        REFERENCES base.role (role_id)
);