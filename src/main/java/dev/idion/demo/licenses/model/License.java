package dev.idion.demo.licenses.model;

import lombok.Builder;
import lombok.Getter;

@Getter
public class License {

	private String id;
	private String organizationId;
	private String productName;
	private String licenseType;

	@Builder(setterPrefix = "with")
	private License(String id, String organizationId, String productName, String licenseType) {
		this.id = id;
		this.organizationId = organizationId;
		this.productName = productName;
		this.licenseType = licenseType;
	}
}
