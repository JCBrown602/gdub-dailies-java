package com.gdub.dailies.nodes;

import com.fasterxml.jackson.annotation.JsonFormat;
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
public class GameType {
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	private String[] gameTypes = { "pve", "pvp", "wvw", "fractals", "special" };

	private Dailies daily;
}
