package dev.idion.demo.licenses.services;

import dev.idion.demo.licenses.model.License;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public class LicenseService {

	public License getLicense(String licenseId) {
		return License
				.builder()
				.withId(licenseId)
				.withOrganizationId(UUID.randomUUID().toString())
				.withProductName("Test Product Name")
				.withLicenseType("PerSeat")
				.build();
	}

	public void saveLicense(License license) {

	}

	public void updateLicense(License license) {

	}

	public void deleteLicense(License license) {

	}

}
