package com.irems.export.excel;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import org.jxls.common.Context;
import org.jxls.util.JxlsHelper;

import com.irems.export.model.Jedi;

public class JediExport {
	public static void exportJediExcelUsingTemplate( List<Jedi> jedis, final String templateName, final String exportName) throws IOException {
		try(InputStream is = Jedi.class.getResourceAsStream(templateName)) {
			//	The target excel file will be written to target/jedi_template.xls.
			try (OutputStream os = new FileOutputStream(exportName)) {
				Context context = new Context();
				context.putVar("jedis", jedis);
				//	All the main processing is performed here
				JxlsHelper.getInstance().processTemplate(is, os, context);
			}
		}
	}

}
