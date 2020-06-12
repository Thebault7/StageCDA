package com.stage.cda.herculepro.utils;

import java.util.List;

import org.springframework.stereotype.Service;

/**
 * 
 * @author Frederic Thebault
 * Date: 11 June 2020
 *
 * @param <T>
 * 
 * Checks if an entity of type T is included inside a list.
 * 
 */
@Service(value="cilcae")
public class checkIfListContainsAnEntity<T extends Comparable<Object>> {

	public boolean checkList(List<T> list, T entity) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).compareTo(entity) == 1) {
				return true;
			}
		}
		return false;
	}
}
