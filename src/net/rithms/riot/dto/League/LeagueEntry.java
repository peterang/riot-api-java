/*
 * Copyright 2014 Taylor Caldwell
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.rithms.riot.dto.League;

import java.io.Serializable;

public class LeagueEntry implements Serializable {

	private static final long serialVersionUID = 3987113536371700279L;
	private String division, playerOrTeamId, playerOrTeamName;
	private boolean isFreshBlood, isHotStreak, isInactive, isVeteran;
	private int leaguePoints, wins, losses;
	private MiniSeries miniSeries;

	public String getPlayerOrTeamId() {
		return playerOrTeamId;
	}

	public boolean isHotStreak() {
		return isHotStreak;
	}

	public boolean isInactive() {
		return isInactive;
	}

	public int getLeaguePoints() {
		return leaguePoints;
	}

	public int getWins() {
		return wins;
	}

	public int getLosses() {
		return losses;
	}

	public MiniSeries getMiniSeries() {
		return miniSeries;
	}

	public boolean isFreshBlood() {
		return isFreshBlood;
	}

	public String getPlayerOrTeamName() {
		return playerOrTeamName;
	}

	public boolean isVeteran() {
		return isVeteran;
	}

	public String getDivision() {
		return division;
	}
}