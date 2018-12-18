package com.komyshenets.controller;

import com.komyshenets.domain.*;
import com.komyshenets.repository.ConfigRepository;
import com.komyshenets.repository.TemplateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * API для управления шаблонами
 */
@RestController
public class ConfigController {
    private final ConfigRepository configRepository;

    @Autowired
    public ConfigController(ConfigRepository configRepository) {
        this.configRepository = configRepository;
    }

    @RequestMapping
    public Template getTemplate(Component component, Stage stage) {
        return null;
    }

    public List<Template> findConfig(Tag... tags) {
        return null;
    }

    public List<Template> findConfig(Template template) {
        return null;
    }



}