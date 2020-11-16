package Model;

import br.com.fiap.healthtrack.Peso;

import java.util.List;
import java.util.Optional;

public interface Dao<T> {
    T getById(int cod);
    List<T> getAll();
    void insert(T t);
    void update(T t);
    void delete(int idx);
}
