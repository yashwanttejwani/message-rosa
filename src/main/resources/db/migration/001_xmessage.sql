create table x_message(
	id BIGSERIAL PRIMARY KEY NOT NULL,
	gupshup_message_id VARCHAR(40) NOT NULL,
	whatsapp_message_id VARCHAR(40) NULL,
	user_id VARCHAR(40) NOT NULL,
	from_id VARCHAR(40) NOT NULL,
	channel VARCHAR(20) NOT NULL,
	provider VARCHAR(20) NOT NULL,
	message_state VARCHAR(20)  NULL,
	x_message text  NULL,
	timestamp timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    app VARCHAR(20) NOT NULL,
    aux_data text NUll
);

CREATE INDEX index_user_id ON x_message(user_id);
CREATE INDEX index_gupshup_message_id ON x_message(gupshup_message_id);
CREATE INDEX index_whatsapp_message_id ON x_message(whatsapp_message_id);
