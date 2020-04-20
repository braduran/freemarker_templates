package com.template.freemarker;

import java.util.List;

import freemarker.template.TemplateMethodModelEx;
import freemarker.template.TemplateModelException;

public class SaveModel implements TemplateMethodModelEx{

	@Override
	public Object exec(@SuppressWarnings("rawtypes") List args) throws TemplateModelException {
		LogBussines log = new LogBussines();
		log.setCode(args.get(0).toString());
		log.setName(args.get(1).toString());
		return null;
	}
}
