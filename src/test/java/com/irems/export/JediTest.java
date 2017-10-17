package com.irems.export;


import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.irems.export.excel.JediExport;
import com.irems.export.model.Jedi;

public class JediTest {

	List<Jedi> jedis = new ArrayList<>();
	
	@Before
	public void setUp() {
		Jedi firstJedi = new Jedi();
		
		firstJedi.setBirthDate(new Date());
		firstJedi.setLightSaberColor("Green");
		firstJedi.setName("Yoda");
		firstJedi.setPayment(new BigDecimal(50.000));
		jedis.add(firstJedi);
		
		Jedi secondJedi = new Jedi();
		secondJedi.setBirthDate(new Date());
		secondJedi.setLightSaberColor("Blue");
		secondJedi.setName("Obi Wan");
		secondJedi.setPayment(new BigDecimal(30.000));
		jedis.add(secondJedi);
		
		Jedi thirdJedi = new Jedi();
		thirdJedi.setBirthDate(new Date());
		thirdJedi.setLightSaberColor("Green");
		thirdJedi.setName("Luke Skywalker");
		thirdJedi.setPayment(new BigDecimal(40.000));
		jedis.add(thirdJedi);
	}

	@Test
	public void test() throws IOException {
		JediExport.exportJediExcelUsingTemplate(jedis, "/jedi_template.xls", "jedi_excel.xls");
        assertTrue( true );
	}

}
