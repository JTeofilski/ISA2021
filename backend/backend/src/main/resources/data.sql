insert into public.users (user_id,email,userpassword,username,firstname,lastname,useraddress,usercity,usercountry,phonenumber)
values
('8f4cc3fa-d118-47b5-98af-e9d4af18bc96', 'mail1', 'marko123', 'MARKO', 'Marko', 'Markovic','adr1','grad1','drz1','tel1'),
('9f9cce5d-9f8a-4eab-a584-cb1fab1580b7', 'mail2', 'janko123', 'JANKO', 'Janko', 'Jankovic','adr2','grad2','drz2','tel2'),
('8f219285-99b0-4a12-ad61-82174d976704', 'mail3', 'pera123', ' PERA', 'Pera', 'Peric','adr3','grad3','drz3','tel3');

insert into public.houses (house_id, housename, houseaddress, housedescription, housegrade)
values
('4f6d80ba-ba61-4f46-9b6b-83f1ff2512d1','kuca1','kucna adr 1','opis kuce 1',1),
('92ec5264-2c8b-481b-8d9d-318927a92bef','kuca2','kucna adr 2','opis kuce 2',2),
('e7349bf6-8ac9-484c-84bc-2a24839c82df','kuca3','kucna adr 3','opis kuce 3',3);

insert into public.ships (ship_id, shipname, shipaddress, shipdescription, shipgrade)
values
('e54b9861-9db8-4660-8c2d-f7df1265521c', 'brod1', 'brod adr 1','brod opis 1', 1),
('a545683a-79a6-42fe-b0a9-fb58178cf144', 'brod2', 'brod adr 2','brod opis 2', 2),
('c61202ed-9c33-4999-90c1-deab03c12960', 'brod3', 'brod adr 3','brod opis 3', 3);


insert into public.roles values ('ca5cbe13-68f1-4059-a1b9-9a5daba2393c', 'ROLE_ADMINISTRATOR'),
                                ('717f40fd-0944-4072-9177-1c219f1cf9a5', 'ROLE_CONSUMER');

insert into public.users_roles (user_id, role_id)  values ('8f4cc3fa-d118-47b5-98af-e9d4af18bc96', 'ca5cbe13-68f1-4059-a1b9-9a5daba2393c'),
                                      ('9f9cce5d-9f8a-4eab-a584-cb1fab1580b7', '717f40fd-0944-4072-9177-1c219f1cf9a5');

insert into public.administrators (user_id, points) values ('8f4cc3fa-d118-47b5-98af-e9d4af18bc96', 5);
