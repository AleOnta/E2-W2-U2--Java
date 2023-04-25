package com.e2w2u2.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReservationRules {
	String rulesHead;
	String rulesBody;
	String rulesFoot;
}
