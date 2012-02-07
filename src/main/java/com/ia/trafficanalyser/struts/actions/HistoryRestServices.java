package com.ia.trafficanalyser.struts.actions;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/historyrest")
public class HistoryRestServices {
	
	@RequestMapping(value = "/speed", method = RequestMethod.GET)
	@ResponseBody
	public List<DateValuePair> speed() {
		List<DateValuePair> list = new ArrayList<DateValuePair>();
		list.add(new DateValuePair(new Date(), 12.00f));
		return list;
	}
	
	@RequestMapping(method=RequestMethod.GET, value = "/hi")
	@ResponseBody
	public String getCreateForm() {
		return "Hello";
	}

}
