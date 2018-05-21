 package com.mobiquity.support.geckoboard.Quartz;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class TimeTrigger extends HttpServlet
{
    @Override
    public void init() throws ServletException
    {

        try {    	
            JobDetail job = JobBuilder.newJob(AppdynamicsInserter.class).build();
  
            Trigger trigger = TriggerBuilder
				.newTrigger()
				.withSchedule(
						CronScheduleBuilder.cronSchedule("0 0/15 * * * ?"))
				.build();

            //schedule it
            Scheduler scheduler = new StdSchedulerFactory().getScheduler();
            scheduler.start();
            scheduler.scheduleJob(job, trigger);

        }catch (Exception ex) {
         }
    
    }
}
