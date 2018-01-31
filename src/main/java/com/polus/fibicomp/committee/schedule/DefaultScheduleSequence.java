package com.polus.fibicomp.committee.schedule;

import org.quartz.CronTrigger;
import org.quartz.TriggerUtils;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

/**
 * This class is default implementation of ScheduleSequence Interface.
 * <p>
 * This implementation should be used if dates generated by schedule sequence needs no modification. Implementation uses
 * org.quartz.TriggerUtils class to generate List of dates from Cron expression.
 * <p>
 * It uses current time zone, where application is hosted. 
 * <p>
 * Note: Dates used in generating schedule must be wrapped with required time accuracy.
 * e.g.  Start Date: 02/01/09 10:10 End Date: 02/05/09 10:10 
 * Generated Dates will be in between 02/01/09 10:10 and 02/05/09 10:10.
 * Any date expected before 02/01/09 10:09 will be ignored. Date 02/01/09 10:00 will be ignored.
 * Any date expected after  02/05/09 10:11 will be ignored. Date 02/05/09 12:00 will be ignored.
 */
public class DefaultScheduleSequence implements ScheduleSequence {

	@Override
	@SuppressWarnings("unchecked")
	public List<Date> executeScheduleSequence(String expression, Date startDate, Date endDate) throws ParseException {

		CronTrigger ct = new CronTrigger(NAME, GROUP, JOBNAME, JOBGROUP, startDate, null, expression);
		return TriggerUtils.computeFireTimesBetween(ct, null, startDate, endDate);
	}

}
