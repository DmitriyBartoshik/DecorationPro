package com.epam;

import com.epam.controller.Controller;
import com.epam.model.dao.Dao;
import com.epam.model.dao.DaoImp;
import com.epam.model.service.Service;
import com.epam.model.service.ServiceImp;
import com.epam.view.View;

public class App {
    public static void main(String[] args) {
        Dao dao = new DaoImp();
        Service service = new ServiceImp(dao);
        Controller controller = new Controller(service);
        View view = new View(controller);

        view.weightCalculate();
        view.costCalculate();
        view.sortedDecorByTransparency();
        view.sortedDecorByCostByTransparency();
        view.findStoneByTransparency(54, 67);

        System.out.println("sdfsdfsdfsdf");
    }
}
