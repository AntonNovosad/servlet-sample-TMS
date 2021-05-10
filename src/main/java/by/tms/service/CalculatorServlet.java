package by.tms.service;

import by.tms.dao.InMemoryOperationDAO;
import by.tms.dao.OperationDAO;
import by.tms.entity.Calculator;
import by.tms.entity.Operation;
import by.tms.entity.User;
import by.tms.exception.OperationNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class CalculatorServlet {
    OperationDAO operationDAO = new InMemoryOperationDAO();

    public List<Operation> getListOperation() {
        return operationDAO.getListOperation();
    }

    public List<Operation> getListOperationByUser(User user) {
        List<Operation> listOperationByUser = new ArrayList<>();
        for (Operation operation : operationDAO.getListOperation()) {
            if (operation.getUser().equals(user)) {
                listOperationByUser.add(operation);
            }
        }
        return listOperationByUser;
    }

    public double selectOperation(double numberOne, double numberTwo, String nameOperation, User user) throws OperationNotFoundException {
        double result;
        switch (nameOperation) {
            case "addition":
                result = Calculator.addition(numberOne, numberTwo);
                operationDAO.saveOperation(new Operation(user, numberOne, numberTwo, nameOperation, result));
                return result;
            case "subtraction":
                result = Calculator.subtraction(numberOne, numberTwo);
                operationDAO.saveOperation(new Operation(user, numberOne, numberTwo, nameOperation, result));
                return result;
            case "multiply":
                result = Calculator.multiply(numberOne, numberTwo);
                operationDAO.saveOperation(new Operation(user, numberOne, numberTwo, nameOperation, result));
                return result;
            case "divide":
                result = Calculator.divide(numberOne, numberTwo);
                operationDAO.saveOperation(new Operation(user, numberOne, numberTwo, nameOperation, result));
                return result;
            default:
                throw new OperationNotFoundException("Operation not found");
        }
    }
}
