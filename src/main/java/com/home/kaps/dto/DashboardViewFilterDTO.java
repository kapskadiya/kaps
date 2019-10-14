package com.home.kaps.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class DashboardViewFilterDTO {

	private Long filterModeId;
	private List<DashboardViewFilterValueDTO> values;

}
