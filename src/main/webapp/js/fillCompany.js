function fillCompany() {
	var select = document.getElementById("list_companies");
	select.addEventListener("change", function() {
		var companyId = select.options[document.getElementById("list_companies").selectedIndex].value;
		document.getElementById("company_id").value = companyId;
	});
}

fillCompany();