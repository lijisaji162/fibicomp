package com.polus.fibicomp.workflow.pojo;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "FIBI_WORKFLOW_MAP")
public class WorkflowMap implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GenericGenerator(name = "mapIdGenerator", strategy = "increment", parameters = {
			@Parameter(name = "initial_value", value = "1"), @Parameter(name = "increment_size", value = "1") })
	@GeneratedValue(generator = "mapIdGenerator")
	@Column(name = "MAP_ID")
	private Integer mapId;

	@Column(name = "MAP_TYPE")
	private char mapType;

	@ManyToOne(optional = false)
	@JoinColumn(foreignKey = @ForeignKey(name = "FK1_FIBI_WORKFLOW_MAP"), name = "MAP_TYPE", referencedColumnName = "MAP_TYPE", insertable = false, updatable = false)
	private WorkflowMapType workflowMapType;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "UPDATE_USER")
	private String updateUser;

	@Column(name = "UPDATE_TIMESTAMP")
	private Timestamp updateTimeStamp;

	public Integer getMapId() {
		return mapId;
	}

	public void setMapId(Integer mapId) {
		this.mapId = mapId;
	}

	public char getMapType() {
		return mapType;
	}

	public void setMapType(char mapType) {
		this.mapType = mapType;
	}

	public WorkflowMapType getWorkflowMapType() {
		return workflowMapType;
	}

	public void setWorkflowMapType(WorkflowMapType workflowMapType) {
		this.workflowMapType = workflowMapType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public Timestamp getUpdateTimeStamp() {
		return updateTimeStamp;
	}

	public void setUpdateTimeStamp(Timestamp updateTimeStamp) {
		this.updateTimeStamp = updateTimeStamp;
	}
}
