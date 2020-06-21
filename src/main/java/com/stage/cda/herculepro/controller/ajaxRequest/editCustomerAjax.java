package com.stage.cda.herculepro.controller.ajaxRequest;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stage.cda.herculepro.ajax.AjaxResponseBody;
import com.stage.cda.herculepro.ajax.AjaxSearchCriteria;
import com.stage.cda.herculepro.bean.Address;
import com.stage.cda.herculepro.service.AddressManager;

@RestController
public class editCustomerAjax {
	
	@Autowired
	AddressManager addressManager;
	
	@RequestMapping(method = RequestMethod.GET, path = {"/listAddresses/{index}/{id}"})
	public ResponseEntity<?> editCustomer(/*@RequestBody AjaxSearchCriteria search, Errors errors,*/
											@PathVariable(value="index") Integer index,
											@PathVariable(value="id") Integer id) {
		AjaxResponseBody result = new AjaxResponseBody();
		//If error, just return a 400 bad request, along with the error message
//        if (errors.hasErrors()) {
//
//            result.setMsg(errors.getAllErrors()
//                        .stream().map(x -> x.getDefaultMessage())
//                        .collect(Collectors.joining(",")));
//
//            return ResponseEntity.badRequest().body(result);
//        }
		System.out.println("numero client " + index);
		System.out.println("numero ville " + id);
        List<Address> listAddresses = addressManager.findAllByCityId(id);
        
        for(int i = 0; i < listAddresses.size(); i++) {
        	System.out.println(listAddresses.get(i));
        }
        
        if (listAddresses.isEmpty()) {
            result.setMsg("Aucune addresse trouvée dans cette ville !");
        } else {
            result.setMsg("succès");
        }
        result.setResult(listAddresses);
        return ResponseEntity.ok(result);
	}
	
	
	
//	@RequestMapping(method = RequestMethod.GET, path = {"/listAddresses/{index}/{id}"})
//	public void editCustomer(ModelMap modelMap, @PathVariable(value="index") Integer index,
//			@PathVariable(value="id") Integer id) {
//		System.out.println("numero client " + index);
//		System.out.println("numero ville " + id);
//		AjaxResult ar = new AjaxResult() {
//		};
//		ModelAndView mav = new ModelAndView("editCustomer");
//		List<Address> listAddresses = addressManager.findAllByCityId(id);
//		mav.addObject("listStreets", listAddresses);
//		return mav;
//	}
}