package com.home.kaps.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

@Getter @Setter
public class DashboardView {

	@Setter(AccessLevel.PROTECTED)
	private Long viewId;

	private String viewName;
	private Integer dashboardInstanceId;
	private Integer dateRangeId;
	private Date startTime;
	private Date endTime;
	private Integer dateGroupByUnitId;
//	private ICompany company;
	private Date deleteDate;
	private boolean defaultView;
	private boolean privateView;
	private Integer groupByModeId;
	private String groupByField;
	private List<DashboardViewFilter> viewFilters;
	private Integer viewOrder;
	private int version;

}
