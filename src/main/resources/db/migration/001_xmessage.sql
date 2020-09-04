create table x_message(
	id BIGSERIAL PRIMARY KEY NOT NULL,
	reply_id VARCHAR(40) NULL,
	message_id VARCHAR(40) NULL,
	cause_id VARCHAR(40) NULL,
	user_id VARCHAR(40) NULL,
	from_id VARCHAR(40) NULL,
	channel VARCHAR(20) NULL,
	provider VARCHAR(20) NULL,
	message_state VARCHAR(20)  NULL,
	x_message text  NULL,
	timestamp timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    app VARCHAR(20) NULL,
    aux_data text NUll
);

CREATE INDEX index_user_id ON x_message(user_id);
CREATE INDEX index_from_id ON x_message(user_id);
CREATE INDEX index_message_id ON x_message(message_id);
CREATE INDEX index_reply_id ON x_message(reply_id);
