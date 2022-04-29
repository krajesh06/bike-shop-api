package com.bikeshopapi.bikeshopapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="bike_details")

public class ListOfBikes {


	        
		    @Id
		    @GeneratedValue(strategy = GenerationType.IDENTITY)
	        private Integer id;
			private String bikename;
			private String model;
			private String color;
			private Integer millage;
			private String warranty;
			private String year;
			private Integer price;
		}

