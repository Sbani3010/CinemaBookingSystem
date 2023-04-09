package za.ac.cput.repository;

import za.ac.cput.domain.Snack;
import za.ac.cput.util.Helper;

import java.util.HashSet;
import java.util.Set;

public class SnackRepository implements ISnackRepository {
    private static SnackRepository repository = null;
    public Set<Snack> snacks = null;

    public static SnackRepository getRepository() {
        if (Helper.isNullOrEmpty(repository))
            repository = new SnackRepository();
        return repository;

    }

    private SnackRepository() {
        snacks = new HashSet<Snack>();
    }

    public Set<Snack> getAll() {
        return snacks;
    }

    @Override
    public boolean create(Snack obj) {
        if (Helper.isNullOrEmpty(obj))
            return false;
        return snacks.add(obj);
    }

    @Override
    public Snack read(String id) {
        if (Helper.isNullOrEmpty(id))
            return null;
        return snacks.stream().filter(e -> e.getId().equals(id)).findAny().orElse(null);
    }

    @Override
    public boolean update(Snack obj) {
        Snack oldSnack = read(obj.getId());
        if (Helper.isNullOrEmpty(oldSnack))
            return false;
        snacks.remove(oldSnack);
        return snacks.add(obj);
    }

    @Override
    public boolean delete(String id) {
        return snacks.remove(read(id));
    }
}
