/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftt.deliverysystem.dao.util;

import com.ftt.deliverysystem.models.util.Model;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public abstract class ArrayListDAO extends DAO {

    protected ArrayList<Object> models;

    public ArrayListDAO(String tabela) {
        super(tabela);
        this.loadModels();
    }

    @Override
    protected abstract void setStatementValues(PreparedStatement stmt, Model model) throws SQLException;

    protected abstract Model convertModel(Model model);

    @SuppressWarnings("unchecked")
    protected void loadModels() throws NullPointerException {
        this.models = super.findAll();
    }

    @SuppressWarnings("rawtypes")
    protected ArrayList getModels() {
        return this.models;
    }

    @Override
    public Model update(Model model) {
        super.update(model);
        this.loadModels();
        return model;
    }

    @Override
    public void delete(Model model) {
        super.delete(model);
        this.loadModels();
    }

    @Override
    public Model insert(Model model) {
        super.insert(model);
        this.models.add(this.convertModel(model));
        return model;
    }
}
