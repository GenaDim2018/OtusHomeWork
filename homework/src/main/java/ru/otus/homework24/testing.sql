CREATE TABLE public.questions (
	question_id int4 NOT NULL GENERATED ALWAYS AS IDENTITY,
	question_text varchar NOT NULL,
	CONSTRAINT questions_pk PRIMARY KEY (question_id)
);

CREATE TABLE public.answeres (
	answer_id int4 NOT NULL GENERATED ALWAYS AS IDENTITY,
	answer varchar NULL,
	is_true bool NOT NULL,
	question_id int4 NOT NULL,
	CONSTRAINT answeres_pk PRIMARY KEY (answer_id),
	CONSTRAINT answeres_fk FOREIGN KEY (question_id) REFERENCES public.questions(question_id)
);