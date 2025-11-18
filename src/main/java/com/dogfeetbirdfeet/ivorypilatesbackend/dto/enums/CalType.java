package com.dogfeetbirdfeet.ivorypilatesbackend.dto.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum CalType {

	SCH_MST("SCH_MST", "스케쥴 마스터"),
	SCH_HIST("SCH_HIST", "스케쥴 히스토리"),
	SCH_FIX("SCH_FIX", "고정 스케쥴"),
	OFF_DAY("OFF_DAY", "휴무일"),
	HOL_DAY("HOL_DAY", "휴무일"),
	CEN_OFF("CEN_OFF", "센터 휴무일"),
	ACCT_RES("ACCT_RES", "강사 휴식시간");

	private final String key;
	private final String value;
}
