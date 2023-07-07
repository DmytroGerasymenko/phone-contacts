INSERT INTO roles (id, name) VALUES (1, 'ADMIN');
INSERT INTO roles (id, name) VALUES (2, 'USER');

-- INSERT INTO users (id, login, password, role_id) VALUES (10, 'Mike', '$2a$12$a22Dw5tRJtZiq/M7NFdtnuIPvMSdNnwie311Qauca8D6koX9BRfWC', 1);
-- INSERT INTO users (id, login, password, role_id) VALUES (11, 'Nick', '$2a$12$thLJOTLbcskE3l64FEcH1eFFqTaInM50n2bCSRcGF0s9aByaFHcYm', 2);
-- INSERT INTO users (id, login, password, role_id) VALUES (12, 'Nora', '$2a$12$bfw/w298ReNGyuw0kSeVaO2HPFPEbctAViHZNUXcVHSsOOLQgu7Iq', 2);
INSERT INTO users (id, login, password, role_id) VALUES (10, 'Mike', '11111', 1);
INSERT INTO users (id, login, password, role_id) VALUES (11, 'Nick', '22222', 2);
INSERT INTO users (id, login, password, role_id) VALUES (12, 'Nora', '33333', 2);

INSERT INTO contacts (id, name, owner_id) VALUES (10, 'Mike''s contact 1', 10);
INSERT INTO contacts (id, name, owner_id) VALUES (11, 'Mike''s contact 2', 10);
INSERT INTO contacts (id, name, owner_id) VALUES (12, 'Mike''s contact 3', 10);
INSERT INTO contacts (id, name, owner_id) VALUES (13, 'Nora''s contact 1', 12);
INSERT INTO contacts (id, name, owner_id) VALUES (14, 'Nora''s contact 2', 12);

INSERT INTO emails (id, email) VALUES (10, 'mike_contact1.mail1@mail.com');
INSERT INTO emails (id, email) VALUES (11, 'mike_contact1.mail2@mail.com');
INSERT INTO emails (id, email) VALUES (12, 'mike_contact1.mail3@mail.com');
INSERT INTO emails (id, email) VALUES (13, 'mike_contact2.mail1@mail.com');
INSERT INTO emails (id, email) VALUES (14, 'mike_contact3.mail1@mail.com');
INSERT INTO emails (id, email) VALUES (15, 'mike_contact3.mail2@mail.com');
INSERT INTO emails (id, email) VALUES (16, 'nora_contact1.mail1@mail.com');
INSERT INTO emails (id, email) VALUES (17, 'nora_contact1.mail2@mail.com');
INSERT INTO emails (id, email) VALUES (18, 'nora_contact2.mail1@mail.com');
INSERT INTO emails (id, email) VALUES (19, 'mikenora_contact1.mail1@mail.com');

INSERT INTO email_contact (email_id, contact_id) VALUES (10, 10);
INSERT INTO email_contact (email_id, contact_id) VALUES (11, 10);
INSERT INTO email_contact (email_id, contact_id) VALUES (12, 10);
INSERT INTO email_contact (email_id, contact_id) VALUES (13, 11);
INSERT INTO email_contact (email_id, contact_id) VALUES (14, 12);
INSERT INTO email_contact (email_id, contact_id) VALUES (15, 12);
INSERT INTO email_contact (email_id, contact_id) VALUES (16, 13);
INSERT INTO email_contact (email_id, contact_id) VALUES (17, 13);
INSERT INTO email_contact (email_id, contact_id) VALUES (18, 14);
INSERT INTO email_contact (email_id, contact_id) VALUES (19, 10);
INSERT INTO email_contact (email_id, contact_id) VALUES (19, 13);

INSERT INTO phones (id, phone) VALUES (10, '+380501110011');
INSERT INTO phones (id, phone) VALUES (11, '+380501110022');
INSERT INTO phones (id, phone) VALUES (12, '+380501110033');
INSERT INTO phones (id, phone) VALUES (13, '+380502220011');
INSERT INTO phones (id, phone) VALUES (14, '+380503330011');
INSERT INTO phones (id, phone) VALUES (15, '+380503330022');
INSERT INTO phones (id, phone) VALUES (16, '+380671110011');
INSERT INTO phones (id, phone) VALUES (17, '+380671110022');
INSERT INTO phones (id, phone) VALUES (18, '+380672220011');
INSERT INTO phones (id, phone) VALUES (19, '+380931110011');

INSERT INTO phone_contact (phone_id, contact_id) VALUES (10, 10);
INSERT INTO phone_contact (phone_id, contact_id) VALUES (11, 10);
INSERT INTO phone_contact (phone_id, contact_id) VALUES (12, 10);
INSERT INTO phone_contact (phone_id, contact_id) VALUES (13, 11);
INSERT INTO phone_contact (phone_id, contact_id) VALUES (14, 12);
INSERT INTO phone_contact (phone_id, contact_id) VALUES (15, 12);
INSERT INTO phone_contact (phone_id, contact_id) VALUES (16, 13);
INSERT INTO phone_contact (phone_id, contact_id) VALUES (17, 13);
INSERT INTO phone_contact (phone_id, contact_id) VALUES (18, 14);
INSERT INTO phone_contact (phone_id, contact_id) VALUES (19, 10);
INSERT INTO phone_contact (phone_id, contact_id) VALUES (19, 13);