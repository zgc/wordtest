package com.hxgsn.demo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;

public class DemoFreemarker {

	public static void main(final String[] args) {
		creatWord();
	}

	@SuppressWarnings("deprecation")
	private static void creatWord(final String string) {
		try {
			// 创建配置实例
			final Configuration cfg = new Configuration();
			cfg.setDefaultEncoding("utf-8");
			cfg.setDirectoryForTemplateLoading(new File("" + "src/main/resources"));
			cfg.setObjectWrapper(new DefaultObjectWrapper());

			// 获取模板
			final Template temp = cfg.getTemplate(string + ".xml");
			temp.setEncoding("utf-8");

			// 创建数据模型
			final Map<String, List> root = new HashMap<String, List>();
			final List<Test> list = new ArrayList<Test>();
			Test test = new Test("test-a", "test-b", "test-c");
			list.add(test);
			test = new Test("test-a2", "test-b2", "test-c2");
			list.add(test);
			test = new Test("test-a1", "test-b1", "test-c1");
			list.add(test);

			root.put("test", list);

			// 将模板和数据模型合并生成文件
			final File docFile = new File("src/main/resources/" + string + ".doc");
			final Writer docout = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(docFile)));
			temp.process(root, docout);

		} catch (final Exception e) {
			e.printStackTrace();
		}

	}

	@SuppressWarnings("deprecation")
	public static void creatWord() {
		try {
			// 创建配置实例
			final Configuration cfg = new Configuration();
			cfg.setDefaultEncoding("utf-8");
			cfg.setDirectoryForTemplateLoading(new File("" + "src/main/resources"));
			cfg.setObjectWrapper(new DefaultObjectWrapper());

			// 获取模板
			final Template temp = cfg.getTemplate("test5.xml");
			temp.setEncoding("utf-8");

			// 创建数据模型
			final Map<String, String> root = new HashMap<String, String>();

			root.put("a", "test-a");
			root.put("b", "test-b");
			root.put("c", "test-c");
			root.put("d", "test-d");
			root.put("e", "test-e");
			root.put("f", "test-f");
			root.put("g", "test-g");
			root.put("h", "test-h");
			root.put("i", "http://www.hxgsn.com/logo.png");
			root.put("j", "test-j");
			root.put("k", "test-k");
			root.put("l", "test-l");
			root.put("m", "test-m");

			// 将模板和数据模型合并生成文件
			final File docFile = new File("src/main/resources/test5.doc");
			final Writer docout = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(docFile)));
			temp.process(root, docout);

		} catch (final Exception e) {
			e.printStackTrace();
		}
	}

}