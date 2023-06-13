package za.ac.cput.service;

import za.ac.cput.domain.ShowTime;

import java.util.Set;

public interface ShowTimeService extends IService<ShowTime,String>{
    Set<ShowTime> getAll();
}

