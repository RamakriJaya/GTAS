/*
 * All GTAS code is Copyright 2016, Unisys Corporation.
 * 
 * Please see LICENSE.txt for details.
 */
package gov.gtas.services.search;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gov.gtas.vo.passenger.PassengerVo;

@Service
public class SearchServiceElastic implements SearchService {
	@Autowired
	private ElasticHelper elastic;
	
	@Override
	public List<PassengerVo> findPassengers(String query, int pageNumber) {
		return elastic.searchPassengers(query, pageNumber);
	}
}
