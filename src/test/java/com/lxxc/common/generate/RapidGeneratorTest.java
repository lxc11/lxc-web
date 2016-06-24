package com.lxxc.common.generate;

import org.junit.Test;


import cn.org.rapid_framework.generator.GeneratorProperties;

public class RapidGeneratorTest {
	@Test
    public void testGeneratorOneTable() throws Exception {
        GeneratorProperties.setProperty(RapidGenerator.PACK_MODULE_NAME,"user");
        RapidGenerator rapidGenerator = new RapidGenerator();
        String projectPath = "C:\\Users\\Administrator\\git\\lxc-web";
        String author = "lvxiaocheng";
        rapidGenerator.generatorOneTable(projectPath,author,"t_user");
	}
}
