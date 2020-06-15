//package com.stage.cda.herculepro.ajax;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.stage.cda.herculepro.bean.Address;
//import com.stage.cda.herculepro.service.AddressManager;
//
//@Controller
//public class editCustomerAjax {
//	
//	@Autowired
//	AddressManager addressManager;
//	
//	@RequestMapping(method = RequestMethod.GET, path = {"/listAddresses/{index}/{id}"})
//	public ModelAndView editCustomer(ModelMap modelMap, @PathVariable(value="index") Integer index,
//			@PathVariable(value="id") Integer id) {
//		System.out.println("numero client" + index);
//		System.out.println("numero ville" + id);
//		ModelAndView mav = new ModelAndView("editCustomer");
//		List<Address> listAddresses = addressManager.findAllByCityId(id);
//		mav.addObject("listStreets", listAddresses);
//		return mav;
//	}
//}