package com.javapoint.user;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor 
public class User implements Serializable {

	private String firstName;
	private String lastName;
	private int age;

}
