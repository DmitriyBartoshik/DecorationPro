package com.epam.model.service.gson;

import com.epam.model.entity.decor.Amber;
import com.epam.model.entity.decor.Decor;
import com.epam.model.entity.decor.Pearls;
import com.epam.model.entity.decor.Stone;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.Collections;
import java.util.List;

public class DecorJsonService {
    private final static RuntimeTypeAdapterFactory<Decor> decorAdapter =
            RuntimeTypeAdapterFactory.of(Decor.class, "class")
                    .registerSubtype(Amber.class, "Amber")
                    .registerSubtype(Pearls.class, "Pearls")
                    .registerSubtype(Stone.class, "Stone");
    private final static Gson gson = new GsonBuilder().registerTypeAdapterFactory(decorAdapter).create();

    public static List<Decor> fromJson(String fileName) {
        File file = getFile(fileName);
        if (file != null) {
            try (JsonReader reader = new JsonReader(new FileReader(file))) {
                Type REVIEW_TYPE = new TypeToken<List<Decor>>() {
                }.getType();
                return gson.fromJson(reader, REVIEW_TYPE);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (JsonSyntaxException e) {
                e.printStackTrace();
            }
        }
        return Collections.emptyList();
    }

    private static File getFile(String fileName) {
        File file = null;
        ClassLoader classLoader = DecorJsonService.class.getClassLoader();
        URL url = classLoader.getResource(fileName);
        if (url != null) {
            file = new File(url.getFile());
        }
        return file;
    }
}
