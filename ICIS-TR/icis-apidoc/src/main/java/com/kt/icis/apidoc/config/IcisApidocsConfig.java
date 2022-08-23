package com.kt.icis.apidoc.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.kt.icis.apidoc.dto.ServiceTarget;

@Component
@ConfigurationProperties("services")
public class IcisApidocsConfig {
	
	private List<ServiceTarget> ServiceTarget = new ArrayList<>();
	
	public List<ServiceTarget> getTarget() {
		return ServiceTarget;
	}

	
}
