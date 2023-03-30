package com.lex.core;

import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PropertySourceFactory;

import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

/**
 * @author : LEX_YU
 * @version : 0.0.1
 * @date : 2023/3/30
 */
public class YamlPropertySourceFactory implements PropertySourceFactory {
	@Override
	public PropertySource<?> createPropertySource(String name, EncodedResource resource) throws IOException {
		YamlPropertiesFactoryBean factoryBean = new YamlPropertiesFactoryBean();
		factoryBean.setResources(resource.getResource());

		Properties properties = factoryBean.getObject();

		assert properties != null;
		return new PropertiesPropertySource(Objects.requireNonNull(resource.getResource().getFilename()), properties);
	}
}
