create table if not exists "player"
    {
    id_player int primary key,
    name_player varchar(100),
    number char(2),
    id_team int references team(id_team)
    }