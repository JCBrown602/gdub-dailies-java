package com.gdub.dailies.nodes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReqLevel {
	private int min;
	private int max;
}
