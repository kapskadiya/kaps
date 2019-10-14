package com.home.kaps.dto;

import java.util.List;

public class DashboardViewReqDTO {

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

	public static class GetAndDeleteReq{

	}

}
