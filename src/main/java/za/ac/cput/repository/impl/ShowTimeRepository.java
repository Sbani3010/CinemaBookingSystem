/*
 * ShowTimeRepository.java
 * Author: Sinethemba Sithela 219112940
 * 06/04/2023
 */
package za.ac.cput.repository.impl;

import za.ac.cput.domain.ShowTime;
import za.ac.cput.repository.IShowTimeRepository;
import za.ac.cput.util.Helper;

import java.util.HashSet;
import java.util.Set;

public class ShowTimeRepository implements IShowTimeRepository {
    private static ShowTimeRepository repository = null;
    private Set<ShowTime> showTimes = null;

    private ShowTimeRepository(){
        showTimes = new HashSet<ShowTime>();
    }

    public static ShowTimeRepository getRepository(){
        if (Helper.isNullOrEmpty(repository))
            repository = new ShowTimeRepository();
        return repository;
    }

    @Override
    public ShowTime create(ShowTime showTime){
        if (Helper.isNullOrEmpty(showTime))
            return null;
        return showTimes.add(showTime)?showTime:null;
    }

    @Override
    public ShowTime read(String id){
        if(Helper.isNullOrEmpty(id))
            return null;
        return showTimes.stream().filter(e -> e.getId().equals(id)).findAny().orElse(null);
    }

    @Override
    public ShowTime update(ShowTime showTime){
        showTimes.remove(read(showTime.getId()));
        return showTimes.add(showTime)?showTime:null;
    }

    @Override
    public boolean delete(String id){
        return showTimes.remove(read(id));
    }

    @Override
    public Set<ShowTime> getAll(){
        return showTimes;
    }
}
