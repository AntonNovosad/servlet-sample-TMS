package by.tms.dao;

import by.tms.entity.Operation;
import by.tms.entity.User;

import java.util.List;

public interface OperationDAO {
    void saveOperation(Operation operation);

    List<Operation> getListOperation();
}
