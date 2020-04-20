package com.template.freemarker;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;

public class FreemarkerInit {

	public static void main(String[] args) throws IOException, TemplateException {
		Configuration cfg = new Configuration(Configuration.VERSION_2_3_29);
		cfg.setDirectoryForTemplateLoading(new File("src/main/resources/templates"));
		cfg.setDefaultEncoding("UTF-8");
		cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
		cfg.setLogTemplateExceptions(false);
		cfg.setWrapUncheckedExceptions(true);
		cfg.setFallbackOnNullLoopVariable(false);
		
		Map<String, Object> root = new HashMap<>();
		root.put("save", new SaveModel());
		root.put("trama", "00000058623900010000000717838501               0          20190823155900040000000000000000          03000000 0000000192.168.164.250220027120200226161703000000000000005862390000tramaVar");
		
		Template temp = cfg.getTemplate("persona.ftlh");
//		Writer out = new OutputStreamWriter(System.out);
		temp.process(root, new StringWriter());
	}
}
