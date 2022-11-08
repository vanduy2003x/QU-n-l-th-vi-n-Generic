package Model;

import java.util.List;

public interface IService<T> {
        void insert(T obj, List<T> objs);
        void delete(T obj, List<T> objs);
        void update(T obj, List<T> objs);
    }

