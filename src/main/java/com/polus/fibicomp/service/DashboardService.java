package com.polus.fibicomp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.polus.fibicomp.pojo.ActionItem;
import com.polus.fibicomp.vo.CommonVO;

/**
 * Dashboard Service class to get dashboard details.
 *
 */
@Service
public interface DashboardService {

	/**
	 * This method is used to get dashboard research summary data for piechart and table. 
	 * @param personId - ID of the logged in person.
	 * @return Set of values used to figure out piechart and research summary table.
	 */
	public String getDashBoardResearchSummary(String personId) throws Exception;

	/**
	 * This method is used to retrieve dashboard data based on tabIndex.
	 * @param vo - Object of CommonVO
	 * @return A list of dashboard data based on tabIndex.
	 * @throws Exception
	 */
	public String getDashBoardData(CommonVO vo) throws Exception;

	/**
	 * This method is used to retrieve award data in piechart based on sponsor type.
	 * @param personId - Logged User ID
	 * @param vo - Object of CommonVO
	 * @return A list of selected pie chart items based on type.
	 * @throws Exception
	 */
	public String getPieChartDataByType(CommonVO vo) throws Exception;

	/**
	 * This method is used to get list of pending actions.
	 * @param personId - Logged User ID
	 * @return a list of pending actions.
	 * @throws Exception
	 */

	public List<ActionItem> getUserNotification(String personId);

	/**
	 * This method is used to get list of selected type in ResearchSummaryTable.
	 * @param personId - Logged User ID
	 * @param researchSummaryIndex - Selected row in Summary table
	 * @return a String of details of selected item
	 * @throws Exception
	 */
	public String getDetailedSummaryData(String personId, String researchSummaryIndex) throws Exception;

	/**
	 * This method is used to retrieve proposal data in donutChart based on status(in progress/awarded).
	 * @param vo - Object of CommonVO
	 * @return A list of selected donutChart items based on status.
	 * @throws Exception
	 */
	public String getDonutChartDataBySponsor(CommonVO vo);

	/**
	 * This method is used to retrieve dashboard summary table data for FibiMobile.
	 * @param personId
	 * @return research summary table for fibiMobile
	 * @throws Exception 
	 */
	public String getFibiResearchSummary(String personId) throws Exception;

	/**
	 * This method is used for searching proposal/award/protocol data using specific fields for FibiMobile.
	 * @param vo - object of CommonVO
	 * @return Search Result
	 * @throws Exception 
	 */
	public String getProposalsBySearchCriteria(CommonVO vo) throws Exception;

	/**
	 * This method is used to retrieve proposal action list data for fibiMobile.
	 * @param vo
	 * @return list of actions
	 * @throws Exception 
	 */
	public String getFibiActionList(CommonVO vo) throws Exception;

	/**
	 * This method is used to retrieve detailed proposal data for FibiMobile.
	 * @param proposalNumber - Proposal Number
	 * @return Details of Proposal Summary, Personnel Details and Budget
	 * @throws Exception 
	 */
	public String getFibiProposalDetails(String proposalNumber) throws Exception;

	/**
	 * This method is used to accept/reject a proposal from mobile application.
	 * @param documentNo - Proposal Number
	 * @return Success or Failure Message
	 * @throws Exception 
	 */
	public String manageFibiProposal(String documentNo) throws Exception;

	/**
	 * This method is used to retrieve questionnaire for FibiMobile.
	 * @param vo - object of CommonVO
	 * @return List of questions
	 * @throws Exception 
	 */
	public String getFibiQuestionnaire(CommonVO vo) throws Exception;

	/**
	 * This method is used to submit answers for questionnaire in FibiMobile.
	 * @param vo
	 * @return Success or Failure Message
	 * @throws Exception 
	 */
	public String submitQuestionnaire(CommonVO vo) throws Exception;
	
	/**
	 * This method is used to get list of selected type in ResearchSummaryTable.
	 * @param personId - Logged User ID
	 * @param researchSummaryIndex - Selected row in Summary table
	 * @return a String of details of selected item
	 * @throws Exception
	 */
	public String getFibiResearchSummary(String personId, String researchSummaryIndex) throws Exception;						
	
}
