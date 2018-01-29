package com.polus.fibicomp.committee.pojo;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "FIBI_COMM_SCHEDULE_ACT_ITEMS")
public class CommitteeScheduleActItems implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COMM_SCHEDULE_ACT_ITEMS_ID")
	private Integer commScheduleActItemsId;

	@Column(name = "SCHEDULE_ID")
	private Integer scheduleId;

	@ManyToOne(optional = false)
	@JoinColumn(foreignKey = @ForeignKey(name = "FK_FIBI_COMM_SCH_ACT_ITEMS"), name = "SCHEDULE_ID", referencedColumnName = "SCHEDULE_ID", insertable = false, updatable = false)
	private CommitteeSchedule committeeSchedule;

	@Column(name = "ACTION_ITEM_NUMBER")
	private Integer actionItemNumber;

	@Column(name = "SCHEDULE_ACT_ITEM_TYPE_CODE")
	private Integer scheduleActItemTypecode;

	@Column(name = "ITEM_DESCTIPTION")
	private String itemDesctiption;

	@Column(name = "UPDATE_TIMESTAMP")
	private Timestamp updateTimestamp;

	@Column(name = "UPDATE_USER")
	private String updateUser;

	@Column(name = "VER_NBR")
	private Integer verNbr;

	@Column(name = "OBJ_ID")
	private String objId;

	public Integer getCommScheduleActItemsId() {
		return commScheduleActItemsId;
	}

	public void setCommScheduleActItemsId(Integer commScheduleActItemsId) {
		this.commScheduleActItemsId = commScheduleActItemsId;
	}

	public CommitteeSchedule getCommitteeSchedule() {
		return committeeSchedule;
	}

	public void setCommitteeSchedule(CommitteeSchedule committeeSchedule) {
		this.committeeSchedule = committeeSchedule;
	}

	public Integer getActionItemNumber() {
		return actionItemNumber;
	}

	public void setActionItemNumber(Integer actionItemNumber) {
		this.actionItemNumber = actionItemNumber;
	}

	public Integer getScheduleActItemTypecode() {
		return scheduleActItemTypecode;
	}

	public void setScheduleActItemTypecode(Integer scheduleActItemTypecode) {
		this.scheduleActItemTypecode = scheduleActItemTypecode;
	}

	public String getItemDesctiption() {
		return itemDesctiption;
	}

	public void setItemDesctiption(String itemDesctiption) {
		this.itemDesctiption = itemDesctiption;
	}

	public Timestamp getUpdateTimestamp() {
		return updateTimestamp;
	}

	public void setUpdateTimestamp(Timestamp updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public Integer getVerNbr() {
		return verNbr;
	}

	public void setVerNbr(Integer verNbr) {
		this.verNbr = verNbr;
	}

	public String getObjId() {
		return objId;
	}

	public void setObjId(String objId) {
		this.objId = objId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(Integer scheduleId) {
		this.scheduleId = scheduleId;
	}
}
