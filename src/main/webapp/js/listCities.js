function listCities() {
	document
			.getElementById("list_cities")
			.addEventListener("change", function() {
						var nameCity = document.getElementById("list_cities")
							.options[document.getElementById("list_cities").selectedIndex]
							.text;
						hideListAddresses();
						var listCities = document.getElementsByClassName(nameCity);
						for (var i = 0; i < listCities.length; i += 1) {
							listCities[i].style.display = 'block';
						};
					});
}

function hideListAddresses() {
	var listAddresses = document.getElementsByClassName('list_addresses');
	for (var i = 0; i < listAddresses.length; i += 1) {
		listAddresses[i].style.display = "none";
	};
}

function writeAddress(number, streetName, postCode, city) {
	document.getElementById("addressNumber").value = number;
	document.getElementById("addressName").value = streetName;
	document.getElementById("cityName").value = city;
	document.getElementById("postCode").value = postCode;
}

listCities();

hideListAddresses();