package dev.idion.demo.licenses.controllers;

import dev.idion.demo.licenses.model.License;
import dev.idion.demo.licenses.services.LicenseService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/organizations/{organizationId}/licenses")
public class LicenseServiceController {

	private final LicenseService licenseService;

	public LicenseServiceController(LicenseService licenseService) {
		this.licenseService = licenseService;
	}

	@GetMapping("/{licenseId}")
	public License getLicenses(
			@PathVariable("organizationId") String organizationId,
			@PathVariable("licenseId") String licenseId) {

		// return licenseService.getLicense(licenseId);
		return License.builder()
				.withId(licenseId)
				.withOrganizationId(organizationId)
				.withProductName("Teleco")
				.withLicenseType("Seat")
				.build();
	}

	@PostMapping("/{licenseId}")
	public String saveLicenses(@PathVariable("licenseId") String licenseId) {
		return "This is the post";
	}

	@PutMapping("/{licenseId}")
	public String updateLicenses(@PathVariable("licenseId") String licenseId) {
		return "This is the put";
	}

	@DeleteMapping("/{licenseId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public String deleteLicenses(@PathVariable("licenseId") String licenseId) {
		return "This is the post";
	}
}
