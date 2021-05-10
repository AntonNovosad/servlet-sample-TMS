package by.tms.dao;

import by.tms.entity.Operation;

import java.util.ArrayList;
import java.util.List;

public class InMemoryOperationDAO implements OperationDAO {
    private static List<Operation> operationList = new ArrayList<>();

    @Override
    public void saveOperation(Operation operation) {
        operationList.add(operation);
    }

    @Override
    public List<Operation> getListOperation() {
        return new ArrayList<>(getListOperation());
    }
}
