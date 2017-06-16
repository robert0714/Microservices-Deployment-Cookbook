package com.packt.microservices.geolocation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class GeoLocationRepository {
	private  List<GeoLocation> geolocations = new ArrayList<>();

	public void addGeoLocation(final GeoLocation aGeoLocation) {
		this.geolocations.add(aGeoLocation);
	}

	public  List<GeoLocation> getGeolocations() {
		return Collections.unmodifiableList(this.geolocations);
	}
	
}
