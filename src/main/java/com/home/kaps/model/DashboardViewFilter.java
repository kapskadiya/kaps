package com.home.kaps.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DashboardViewFilter {

	private Long id;
	private DashboardView view;
	private String filterValue;
	private DashboardViewFilterType type;

}
