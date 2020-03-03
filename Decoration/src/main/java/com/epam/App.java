package com.epam;

import com.epam.controller.Controller;
import com.epam.model.dao.Dao;
import com.epam.model.dao.DecorDao;
import com.epam.model.entity.decor.Decor;
import com.epam.model.service.Service;
import com.epam.model.service.ServiceImp;
import com.epam.model.service.gson.DecorJsonService;
import com.epam.view.View;

import java.util.List;

public class App {
    private static final String FILE = "data.txt";

    public static void main(String[] args) {
        List<Decor> decors = DecorJsonService.fromJson(FILE);
        Dao dao = new DecorDao.Builder().setDecors(decors).build();
        Service service = new ServiceImp(dao);
        Controller controller = new Controller(service);
        View view = new View(controller);

        view.weightCalculate();
        view.costCalculate();
        view.sortedDecorByTransparency();
        view.sortedDecorByCostByTransparency();
        view.findStoneByTransparency(54, 67);
    }
}
