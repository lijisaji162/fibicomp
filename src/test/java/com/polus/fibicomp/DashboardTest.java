package com.polus.fibicomp;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

import org.apache.log4j.Logger;

public class DashboardTest {

	protected static Logger logger = Logger.getLogger(DashboardTest.class.getName());

	public static void main(String[] args) throws SQLException {

		// AnnotationConfigApplicationContext ctx = new
		// AnnotationConfigApplicationContext(FibiRepoConfig.class);
		//AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		//ctx.scan("com.polus.fibicomp.*");// This will load the configured
											// components UserService,
											// UserRepository,
		//ctx.refresh();

		//System.out.println(ctx);
		//@SuppressWarnings("unused")
		//DashboardDao dashboardDao = ctx.getBean("dashboardDao", DashboardDaoImpl.class);
		/*
		 * DashboardService dashboardService = ctx.getBean("dashboardService",
		 * DashboardServiceImpl.class); PersonDTO personDTO = new PersonDTO();
		 * personDTO.setCreateNo(0);
		 * personDTO.setEmail("admin98@mailinator.com");
		 * personDTO.setFirstName("admin");
		 * personDTO.setFullName("admin,admin"); personDTO.setLastName("admin");
		 * personDTO.setPersonID("admin"); personDTO.setUserName("admin");
		 */
		/*
		 * try { String res =
		 * dashboardService.getDashBoardResearchSummary(personDTO);
		 * System.out.println("res : " + res); } catch (Exception e) { catch block e.printStackTrace(); }
		 */

		/*
		 * DashBoardProfile res1 =
		 * dashboardDao.getDashBoardDataForAward(personDTO, "AWARD", 30,
		 * "update_timestamp", ""); System.out.println("DashBoardDetailMap :" +
		 * res1.getDashBoardDetailMap()); ArrayList<HashMap<String, Object>>
		 * dashBoardDetailsMap1 = res1.getDashBoardDetailMap(); for
		 * (HashMap<String, Object> u : dashBoardDetailsMap1) {
		 * System.out.println(u.entrySet()); }
		 */

		/*
		 * DashBoardProfile res2 =
		 * dashboardDao.getDashBoardDataForProposal(personDTO, "PROPOSAL", 30,
		 * "update_timestamp", "DESC"); System.out.println(
		 * "DashBoardDetailMap :" + res2.getDashBoardDetailMap());
		 * ArrayList<HashMap<String, Object>> dashBoardDetailsMap2 =
		 * res2.getDashBoardDetailMap(); for (HashMap<String, Object> u :
		 * dashBoardDetailsMap2) { System.out.println(u.entrySet()); }
		 */

		/*
		 * DashBoardProfile res3 =
		 * dashboardDao.getProtocolDashboardData(personDTO, "IRB", 30,
		 * "update_timestamp", ""); System.out.println("DashBoardDetailMap :" +
		 * res3.getDashBoardDetailMap()); ArrayList<HashMap<String, Object>>
		 * dashBoardDetailsMap3 = res3.getDashBoardDetailMap(); for
		 * (HashMap<String, Object> u : dashBoardDetailsMap3) {
		 * System.out.println(u.entrySet()); }
		 */

		/*
		 * DashBoardProfile res4 =
		 * dashboardDao.getDashBoardDataForIacuc(personDTO, "IACUC", 30,
		 * "update_timestamp", ""); System.out.println("DashBoardDetailMap :" +
		 * res4.getDashBoardDetailMap()); ArrayList<HashMap<String, Object>>
		 * dashBoardDetailsMap4 = res4.getDashBoardDetailMap(); for
		 * (HashMap<String, Object> u : dashBoardDetailsMap4) {
		 * System.out.println(u.entrySet()); }
		 */

		/*
		 * DashBoardProfile res4 =
		 * dashboardDao.getDashBoardDataForDisclosures(personDTO, "DISCLOSURE",
		 * 30, "update_timestamp", ""); System.out.println(
		 * "DashBoardDetailMap :" + res4.getDashBoardDetailMap());
		 * ArrayList<HashMap<String, Object>> dashBoardDetailsMap4 =
		 * res4.getDashBoardDetailMap(); for (HashMap<String, Object> u :
		 * dashBoardDetailsMap4) { System.out.println(u.entrySet()); }
		 */

		/*
		 * Integer count = dashboardDao.getDashBoardCount(personDTO, "AWARD",
		 * 30); System.out.println("count :" + count);
		 */
		// LoginService loginService = ctx.getBean("loginService",
		// LoginServiceImpl.class);
		// LoginDao loginDao = ctx.getBean("loginDao", LoginDaoImpl.class);

		// List<PrincipalBo> allUser = dashboardService.getAllUsers();
		// PersonDTO allUser = loginDao.readPersonData("admin");
		// boolean isLoginSuccess = loginDao.authenticate("admin", "admin");

		// for (PersonDTO u : allUser) {
		// System.out.println("id : " + allUser.getPersonID() + " name : " +
		// allUser.getFirstName());
		// }
		// dashboardDao.getAllAwardViews();
		System.out.println("test");
		List<String> tests = new ArrayList<>();
		tests.add("abc");
		tests.add("dfes");
		tests.add("dsfgdfg");
		tests.add("sdfsf");
		StringJoiner sj = new StringJoiner(", ");
		for (String txt : tests) {
			sj.add(txt);
		}
		System.out.println("sj : " + sj.toString());
		
	}

}
