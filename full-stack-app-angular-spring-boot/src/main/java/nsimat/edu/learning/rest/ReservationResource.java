package nsimat.edu.learning.rest;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import nsimat.edu.learning.model.request.ReservationRequest;
import nsimat.edu.learning.model.response.ReservationResponse;

@RestController
@RequestMapping(ResourceConstants.ROOM_RESERVATION_V1)
public class ReservationResource {
	
	@GetMapping(path="", produces = "application/json")
	public ResponseEntity<ReservationResponse> getAvailableRooms(
			@RequestParam(value = "checkin")
			@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
			LocalDate checkin, 
			@RequestParam(value = "checkout")
			@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
			LocalDate checkout){
		
		return new ResponseEntity<>(new ReservationResponse(), HttpStatus.OK);
	}
	
	@PostMapping(produces = "application/json", consumes = "application/json")
	public ResponseEntity<ReservationResponse> createReservation(
			@RequestBody
			ReservationRequest reservationRequest){
		
		return new ResponseEntity<>(new ReservationResponse(), HttpStatus.CREATED);
		
	}

	@PutMapping(produces = "application/json", consumes = "application/json")
	public ResponseEntity<ReservationResponse> updateReservation(
			@RequestBody
			ReservationRequest reservationRequest){
		
		return new ResponseEntity<>(new ReservationResponse(), HttpStatus.OK);
		
	}
	
	@DeleteMapping("/{reservationId}")
	public ResponseEntity<Void> deleteReservation(@PathVariable long reservationId){
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		
	}
}
