package com.stage.cda.herculepro.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.stage.cda.herculepro.bean.Address;
import com.stage.cda.herculepro.bean.City;

//@Controller
//public class AddressController extends HttpServlet {
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//	
//	@Autowired
//	AddressManager addressManager;
//	
//	@Override
//	public void init(ServletConfig config) throws ServletException {
//		SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext());
//	}
//	
////	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
////		int cityId = Integer.parseInt(request.getParameter("cityId"));
////		System.out.println(cityId + "  ________________________________________________");
////	}
//	
//	@PreDestroy
//    private void shutdown() {
//        //TODO: destroy code
//    }
//	
//	@RequestMapping(method = RequestMethod.GET, path = {"/listAddresses/{cityId}"})
//	public void listAddresses (@PathVariable("cityId") int cityId, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		RequestDispatcher rd;
//		System.out.println(cityId);
//		System.out.println("-----------------------------------------------");
//		List<Address> listAddresses = new ArrayList<>();
//		listAddresses = addressManager.findAllByCityId(cityId);
//		System.out.println(listAddresses.get(0));
//		request.setAttribute("listAddresses", "{'name': 'Meowsalot', 'species': 'cat', 'favFood': 'tuna'}");
//		rd = request.getRequestDispatcher("/WEB-INF/jsp/listCities.jsp");
//		System.out.println("TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT");
//		rd.forward(request, response);
////		ModelAndView mav = new ModelAndView("editCustomer");
////		return mav;
//	}
//}

@RestController
public class AddressController {
	
	@RequestMapping(method = RequestMethod.GET, path = {"/listAddresses/{cityId}"})
	@ResponseBody
	public Address getAddressByCityId(@PathVariable("cityId") final int cityId) {
		final Address address = new Address();
		
		address.setCity(new City(1, "aaaa", "bbbb"));
		address.setAddressName("rue truc");
		address.setAddressNumber("67");
		address.setId(1);
		System.out.println(address.toString());
		return address;
	}
}
