package nsimat.edu.learning.model.response;

import lombok.Getter;
import lombok.Setter;
import nsimat.edu.learning.model.Links;

@Setter
@Getter
public class ReservationResponse {
	
	private Long id;
	private Integer roomNumber;
	private Integer price;
	private Links links;
	
	public ReservationResponse(Integer roomNumber, Integer price) {
		super();
		this.roomNumber = roomNumber;
		this.price = price;
	}

	public ReservationResponse() {
		super();
	}
	
	

}
