package com.polus.fibicomp.schedule.vo;

import java.util.ArrayList;
import java.util.List;

import com.polus.fibicomp.committee.pojo.Committee;
import com.polus.fibicomp.committee.pojo.CommitteeSchedule;
import com.polus.fibicomp.committee.pojo.CommitteeScheduleActItems;
import com.polus.fibicomp.committee.pojo.CommitteeScheduleAttendance;
import com.polus.fibicomp.committee.pojo.ScheduleActItemType;
import com.polus.fibicomp.committee.pojo.ScheduleStatus;

public class ScheduleVo {

	private Integer scheduleId;

	private CommitteeSchedule committeeSchedule;

	private Boolean status;

	private String message;

	private Committee committee;

	private String committeeId;

	private List<ScheduleStatus> scheduleStatus;

	private List<CommitteeScheduleAttendance> memberAbsents;

	private List<CommitteeScheduleAttendance> otherPresents;

	private List<ScheduleActItemType> scheduleActItemTypes;

	private CommitteeScheduleActItems committeeScheduleActItems;

	private Integer commScheduleActItemsId;

	public ScheduleVo() {
		memberAbsents = new ArrayList<CommitteeScheduleAttendance>();
		otherPresents = new ArrayList<CommitteeScheduleAttendance>();
	}

	public CommitteeSchedule getCommitteeSchedule() {
		return committeeSchedule;
	}

	public void setCommitteeSchedule(CommitteeSchedule committeeSchedule) {
		this.committeeSchedule = committeeSchedule;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Committee getCommittee() {
		return committee;
	}

	public void setCommittee(Committee committee) {
		this.committee = committee;
	}

	public String getCommitteeId() {
		return committeeId;
	}

	public void setCommitteeId(String committeeId) {
		this.committeeId = committeeId;
	}

	public Integer getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(Integer scheduleId) {
		this.scheduleId = scheduleId;
	}

	public List<ScheduleStatus> getScheduleStatus() {
		return scheduleStatus;
	}

	public void setScheduleStatus(List<ScheduleStatus> scheduleStatus) {
		this.scheduleStatus = scheduleStatus;
	}

	public List<CommitteeScheduleAttendance> getMemberAbsents() {
		return memberAbsents;
	}

	public void setMemberAbsents(List<CommitteeScheduleAttendance> memberAbsents) {
		this.memberAbsents = memberAbsents;
	}

	public List<CommitteeScheduleAttendance> getOtherPresents() {
		return otherPresents;
	}

	public void setOtherPresents(List<CommitteeScheduleAttendance> otherPresents) {
		this.otherPresents = otherPresents;
	}

	public List<ScheduleActItemType> getScheduleActItemTypes() {
		return scheduleActItemTypes;
	}

	public void setScheduleActItemTypes(List<ScheduleActItemType> scheduleActItemTypes) {
		this.scheduleActItemTypes = scheduleActItemTypes;
	}

	public CommitteeScheduleActItems getCommitteeScheduleActItems() {
		return committeeScheduleActItems;
	}

	public void setCommitteeScheduleActItems(CommitteeScheduleActItems committeeScheduleActItems) {
		this.committeeScheduleActItems = committeeScheduleActItems;
	}

	public Integer getCommScheduleActItemsId() {
		return commScheduleActItemsId;
	}

	public void setCommScheduleActItemsId(Integer commScheduleActItemsId) {
		this.commScheduleActItemsId = commScheduleActItemsId;
	}
}
