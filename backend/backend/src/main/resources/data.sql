
insert into public.users values ('8f4cc3fa-d118-47b5-98af-e9d4af18bc96', 'marko', 'marko123', 'Marko', 'Markovic'),
                                ('9f9cce5d-9f8a-4eab-a584-cb1fab1580b7', 'janko', 'janko123', 'Janko', 'Jaknovic');


insert into public.roles values ('ca5cbe13-68f1-4059-a1b9-9a5daba2393c', 'ROLE_ADMINISTRATOR'),
                                ('717f40fd-0944-4072-9177-1c219f1cf9a5', 'ROLE_CONSUMER');

insert into public.users_roles values ('8f4cc3fa-d118-47b5-98af-e9d4af18bc96', 'ca5cbe13-68f1-4059-a1b9-9a5daba2393c'),
                                      ('9f9cce5d-9f8a-4eab-a584-cb1fab1580b7', '717f40fd-0944-4072-9177-1c219f1cf9a5');