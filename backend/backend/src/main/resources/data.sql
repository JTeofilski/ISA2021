insert into public.countries (country_id, country_name)
values
('c6460f6a-028b-4ba5-86ae-2b51611eb86a', 'Srbija'),
('d2a01179-7419-4d70-99e0-938e726a24a5','Grcka'),
('98adb551-dee3-4827-a96b-e5828fb3ada2','Italija'),
('bb17cb6e-8411-4f07-aa87-7989f10bfd7f','Francuska'),
('e9fa0296-ccdb-4ed6-8779-59bbf6039b34','Spanija');

insert into public.cities (city_id,city_name,post_code)
values
('7acf7dfd-4920-4391-845a-ba5a6fde9949','Ruma',22400),
('1772da69-7165-4085-bc05-35c0f492dab7','Beograd',11000),
('a20e90bf-c460-42c2-8be3-1603971ed401','Solun',54248),
('f9a167a8-07c8-407a-b2ab-b8c88c5302b2','Rim',00100),
('e1e299aa-0f63-4c86-9b5b-5a8154dcaba7','Pariz',75000),
('49ee2312-4010-4cce-a60c-285dca87e7f0','Madrid',28001);

insert into public.addresses (address_id,street,house_number)
values
('fa9fd68a-8ba3-4b42-819f-1a006050e464','Ulica1',1),
('091b93dc-90e3-488b-905c-b2d4e79557f5','Ulica2',2),
('b67accfd-2812-4026-a720-6ad405169afa','Ulica3',3),
('32b85736-1c97-44e9-91a5-a66427221af2','Ulica4',4),
('3cc53654-aa0a-4d63-95c2-9b8d6690b12c','Ulica5',5),
('0fe5ea2e-1c8b-48ef-bada-0c6ae2f37978','Ulica6',6);

insert into public.users (user_id,email,user_password,username,first_name,last_name,phone_number)
values
('8f4cc3fa-d118-47b5-98af-e9d4af18bc96', 'mail1', 'marko123', 'MARKO', 'Marko', 'Markovic','tel1'),
('9f9cce5d-9f8a-4eab-a584-cb1fab1580b7', 'mail2', 'janko123', 'JANKO', 'Janko', 'Jankovic','tel2'),
('8f219285-99b0-4a12-ad61-82174d976704', 'mail3', 'pera123', ' PERA', 'Pera', 'Peric','tel3'),
('23d7980c-6d11-4abd-a499-b4ebea0da646', 'mail4', 'zika123', ' ZIKA', 'Zika', 'Zikic','tel4'),
('fcbf6574-cce9-4a15-b5aa-745a7d0433fc', 'mail5', 'mika123', ' MIKA', 'Mika', 'Mikic','tel5'),
('7e74000b-2c36-42e5-8114-632df7dfab35', 'mail6', 'jova123', 'JOVA', 'Jova', 'Jovic','tel6');

insert into public.ships (ship_id, ship_name, ship_description, ship_grade)
values
('e54b9861-9db8-4660-8c2d-f7df1265521c', 'brod1','brod opis 1', 1),
('a545683a-79a6-42fe-b0a9-fb58178cf144', 'brod2','brod opis 2', 2),
('c61202ed-9c33-4999-90c1-deab03c12960', 'brod3','brod opis 3', 3);



--insert into public.houses (house_id, housename, houseaddress, housedescription, housegrade)
--values
--('4f6d80ba-ba61-4f46-9b6b-83f1ff2512d1','kuca1','kucna adr 1','opis kuce 1',1),
--('92ec5264-2c8b-481b-8d9d-318927a92bef','kuca2','kucna adr 2','opis kuce 2',2),
--('e7349bf6-8ac9-484c-84bc-2a24839c82df','kuca3','kucna adr 3','opis kuce 3',3);



insert into public.roles values ('ca5cbe13-68f1-4059-a1b9-9a5daba2393c', 'ROLE_ADMINISTRATOR'),
                                ('717f40fd-0944-4072-9177-1c219f1cf9a5', 'ROLE_CONSUMER');

--insert into public.users_roles (user_id, role_id)  values ('8f4cc3fa-d118-47b5-98af-e9d4af18bc96', 'ca5cbe13-68f1-4059-a1b9-9a5daba2393c'),
--                                      ('9f9cce5d-9f8a-4eab-a584-cb1fab1580b7', '717f40fd-0944-4072-9177-1c219f1cf9a5');

--insert into public.administrators (user_id, points) values ('8f4cc3fa-d118-47b5-98af-e9d4af18bc96', 5);
