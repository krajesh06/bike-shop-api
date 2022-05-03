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
@Entity(name="reviews")

public class Reviews {

	        
		    @Id
		    @GeneratedValue(strategy = GenerationType.IDENTITY)
	        private Integer id;
			private String name;
			private String phonenumber;
			private String queries;
			private String feedback;
		}


