package com.codingworld.multitenant.scheduler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.codingworld.multitenant.feign.FeignInter;
import com.codingworld.multitenant.model.Student;

//  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
@Component
public class Scheduler {

	@Autowired
	FeignInter feign;
	@Scheduled(cron="* */10 * * * *")  //10sec gap
	public void schedulingtest() {
		System.out.println("scheduler called"); 
		List<Student> studentlist=feign.getAll("tenant1");
		System.out.println("studentsize"+studentlist.size());
		if(studentlist!=null && studentlist.size()>0) {
			studentlist.stream().forEach(stu->{
			System.out.println("studentsize"+stu.getName());
			feign.save(stu, "tenant2");
			});
		}
	}
}
