package com.komyshenets.controller;

import com.komyshenets.domain.*;
import com.komyshenets.repository.TemplateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * API для управления шаблонами
 */
@RestController
public class TemplateController {
    private final TemplateRepository templateRepository;

    @Autowired
    public TemplateController(TemplateRepository templateRepository) {
        this.templateRepository = templateRepository;
    }

    @RequestMapping
    public Template getTemplate(Component component, Stage stage) {
        return null;
    }

    public List<Template> findTemplates(Tag... tags) {
        return null;
    }

    public List<Template> getParentTemplates(Config config) {
        return null;
    }


    public boolean deleteTemplate(Template template) {
        return false;
    }


    public Template editTemplate(Template template, String json) {
        return null;
    }

    public String getTemplateBody(Template template) {
        return null;
    }

}