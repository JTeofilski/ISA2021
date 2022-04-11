insert into public.countries (id, country_name)
values
('c6460f6a-028b-4ba5-86ae-2b51611eb86a', 'Srbija'),
('d2a01179-7419-4d70-99e0-938e726a24a5','Grcka'),
('98adb551-dee3-4827-a96b-e5828fb3ada2','Italija'),
('bb17cb6e-8411-4f07-aa87-7989f10bfd7f','Francuska'),
('e9fa0296-ccdb-4ed6-8779-59bbf6039b34','Spanija');

insert into public.cities (id,city_name,post_code,country_id)
values
('7acf7dfd-4920-4391-845a-ba5a6fde9949','Ruma',22400,'c6460f6a-028b-4ba5-86ae-2b51611eb86a'),
('1772da69-7165-4085-bc05-35c0f492dab7','Beograd',11000, 'c6460f6a-028b-4ba5-86ae-2b51611eb86a'),
('a20e90bf-c460-42c2-8be3-1603971ed401','Solun',54248, 'd2a01179-7419-4d70-99e0-938e726a24a5'),
('f9a167a8-07c8-407a-b2ab-b8c88c5302b2','Rim',00100, '98adb551-dee3-4827-a96b-e5828fb3ada2'),
('e1e299aa-0f63-4c86-9b5b-5a8154dcaba7','Pariz',75000, 'bb17cb6e-8411-4f07-aa87-7989f10bfd7f'),
('49ee2312-4010-4cce-a60c-285dca87e7f0','Madrid',28001, 'e9fa0296-ccdb-4ed6-8779-59bbf6039b34');

insert into public.addresses (id,street)
values
('fa9fd68a-8ba3-4b42-819f-1a006050e464','Ulica 1'),
('091b93dc-90e3-488b-905c-b2d4e79557f5','Ulica 2'),
('b67accfd-2812-4026-a720-6ad405169afa','Ulica 3'),
('32b85736-1c97-44e9-91a5-a66427221af2','Ulica 4'),
('3cc53654-aa0a-4d63-95c2-9b8d6690b12c','Ulica 5'),
('0fe5ea2e-1c8b-48ef-bada-0c6ae2f37978','Ulica 6');

insert into public.ships (id, ship_name, ship_description, ship_grade)
values
('e54b9861-9db8-4660-8c2d-f7df1265521c', 'brod1','brod opis 1', 1),
('a545683a-79a6-42fe-b0a9-fb58178cf144', 'brod2','brod opis 2', 2),
('c61202ed-9c33-4999-90c1-deab03c12960', 'brod3','brod opis 3', 3),
('2490a4ee-dd1f-4f06-8edb-66c652969157', 'brod4','brod opis 4', 4),
('622e1d98-f843-403f-b410-a1d87f3d4721', 'brod5','brod opis 5', 5),
('8bedbf0e-d0b5-47b0-92c8-290c181c9466', 'brod6','brod opis 6', 6);

insert into public.adventures (id, adv_name, adv_address, adv_description, adv_grade)
values
('9e5158a0-d664-461e-8b1a-cf635aa31929', 'avantura1', 'adv adr 1' ,'av opis 1', 1),
('77c142dc-cb3f-455e-820e-c045b4fc89d1', 'avantura2', 'adv adr 2' ,'av opis 2', 2),
('d1ae7370-8dd6-433f-bea9-5c405d53e905', 'avantura3', 'adv adr 3' ,'av opis 3', 3),
('a2a9e220-83f6-4f4c-ac0d-4df1ce3276c8', 'avantura4', 'adv adr 4' ,'av opis 4', 4),
('c9e99051-b57a-443d-a39c-5cee14479d2e', 'avantura5', 'adv adr 5' ,'av opis 5', 5),
('edf0963d-9353-4e86-84e8-4abdce32e090', 'avantura6', 'adv adr 6' ,'av opis 6', 6);



insert into public.houses (id, house_name, house_description, house_grade)
values
('4f6d80ba-ba61-4f46-9b6b-83f1ff2512d1','kuca1','opis kuce 1',1),
('92ec5264-2c8b-481b-8d9d-318927a92bef','kuca2','opis kuce 2',2),
('e7349bf6-8ac9-484c-84bc-2a24839c82df','kuca3','opis kuce 3',3),
('7a4b4e69-7404-44f0-b870-3834863104b5','kuca4','opis kuce 4',4),
('cd63b1b1-60b0-4818-9731-84a6a1b63f80','kuca5','opis kuce 5',5),
('12f1f7a1-95b7-4c04-9f7e-be137f730a80','kuca6','opis kuce 6',6);

insert into public.users (id,email,user_password,first_name,last_name,phone_number)
values
('8f4cc3fa-d118-47b5-98af-e9d4af18bc96', 'mail1', '$2a$10$mVjiyAQvJJjK41FmDVmkEeDfUcA.RQn975OwJ9M0pM3BU9kxFTUl.', 'Marko', 'Markovic','tel1'),
('9f9cce5d-9f8a-4eab-a584-cb1fab1580b7', 'mail2', '$2a$12$khjjlCvof3U/dhqr4OG6u.lLy28Bu9mRRZ/.jeJEn7EebsBYywKAu', 'Janko', 'Jankovic','tel2'),
('8f219285-99b0-4a12-ad61-82174d976704', 'mail3', '$2a$12$khjjlCvof3U/dhqr4OG6u.lLy28Bu9mRRZ/.jeJEn7EebsBYywKAu', 'Pera', 'Peric','tel3'),
('23d7980c-6d11-4abd-a499-b4ebea0da646', 'mail4', '$2a$12$khjjlCvof3U/dhqr4OG6u.lLy28Bu9mRRZ/.jeJEn7EebsBYywKAu', 'Zika', 'Zikic','tel4'),
('fcbf6574-cce9-4a15-b5aa-745a7d0433fc', 'mail5', '$2a$12$khjjlCvof3U/dhqr4OG6u.lLy28Bu9mRRZ/.jeJEn7EebsBYywKAu', 'Mika', 'Mikic','tel5'),
('7e74000b-2c36-42e5-8114-632df7dfab35', 'mail6', '$2a$12$khjjlCvof3U/dhqr4OG6u.lLy28Bu9mRRZ/.jeJEn7EebsBYywKAu', 'Jova', 'Jovic','tel6'),
('875c51d8-a7d1-43b7-a4ec-93d6c1e2b882', 'mail7', '$2a$12$khjjlCvof3U/dhqr4OG6u.lLy28Bu9mRRZ/.jeJEn7EebsBYywKAu', 'Joca', 'Jocic','tel7');





insert  into public.instructors(id,adventure_id)
values
('875c51d8-a7d1-43b7-a4ec-93d6c1e2b882','9e5158a0-d664-461e-8b1a-cf635aa31929');






insert into public.roles values ('77654069-6a05-4293-a3d6-def4b71e84b7', 'ROLE_ADMINISTRATOR'),
                                ('cfd893e7-e852-4c0a-8191-41fb993d7a8a', 'ROLE_CUSTOMER'),
                                ('a774e413-b9ab-49ec-b228-766a1e42e554', 'ROLE_HOUSE_OWNER'),
                                ('50a7ab11-6df6-4764-b6ee-f06a558b4e76', 'ROLE_SHIP_OWNER'),
                                ('27a39c58-90b1-4fa5-9ea9-5a6d57b41655', 'ROLE_INSTRUCTOR');


insert into public.users_roles (user_id, role_id)
values
('8f4cc3fa-d118-47b5-98af-e9d4af18bc96', '77654069-6a05-4293-a3d6-def4b71e84b7'),
('9f9cce5d-9f8a-4eab-a584-cb1fab1580b7', '77654069-6a05-4293-a3d6-def4b71e84b7'),
('8f219285-99b0-4a12-ad61-82174d976704', 'cfd893e7-e852-4c0a-8191-41fb993d7a8a'),
('23d7980c-6d11-4abd-a499-b4ebea0da646', 'cfd893e7-e852-4c0a-8191-41fb993d7a8a'),
('fcbf6574-cce9-4a15-b5aa-745a7d0433fc', '50a7ab11-6df6-4764-b6ee-f06a558b4e76'),
('7e74000b-2c36-42e5-8114-632df7dfab35', 'a774e413-b9ab-49ec-b228-766a1e42e554');

insert into public.administrators (id)
values
('8f4cc3fa-d118-47b5-98af-e9d4af18bc96'),
('9f9cce5d-9f8a-4eab-a584-cb1fab1580b7');


insert into public.customers (id)
values
('8f219285-99b0-4a12-ad61-82174d976704'),
('23d7980c-6d11-4abd-a499-b4ebea0da646'),
('fcbf6574-cce9-4a15-b5aa-745a7d0433fc'),
('7e74000b-2c36-42e5-8114-632df7dfab35');

