create table if not exists "have"
    {
    id_has int primary key,
    id_team int references team(id_team),
    id_sponsor int references sponsor(id_sponsor)
    }
