package com.ak.service;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class LinksServiceImpl implements ILinksService {

	@Override
	public String generateWishMessage() {

		// Get System date and time
		LocalDateTime ldt = LocalDateTime.now();

		// Get current hour of the day
		int hour = ldt.getHour();

		if (hour < 12) {
			return "Good Morning";
		} else if (hour < 16) {
			return "Good Afternoon";
		} else if (hour < 20) {
			return "Good Evening";
		} else
			return "Good Night";
	}

	@Override
	public Set<String> fetchAllLanguages() {
		Locale[] locales = Locale.getAvailableLocales();
		HashSet<String> langset = new HashSet<String>();
		for (Locale l : locales) {
			langset.add(l.getDisplayLanguage());
		}
		return langset;
	}

}
