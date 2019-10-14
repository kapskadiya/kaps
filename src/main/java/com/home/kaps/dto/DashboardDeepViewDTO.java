package com.home.kaps.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter @Setter
public class DashboardDeepViewDTO implements Serializable {

	private Long id;
	private String name;
	private Integer dateRangeId;
	private Integer dateGroupByUnitId;
	private Long startTime;
	private Long endTime;
	private List<DashboardViewFilterDTO> filters;
	private Integer groupByModeId;
	private String groupByValue;
	private int version;

}
