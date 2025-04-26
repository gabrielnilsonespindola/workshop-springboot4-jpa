package com.educandoweb.course.entities;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {

		private static final long serialVersionUID = 1L;
		
		private Long Id = null;
		private String Name = null;
		private String Email = null;
		private String Phone = null;;
		private String Password = null;
		
		public User() {
		}

		public User(Long id, String name, String email, String phone, String password) {
			super();
			Id = id;
			Name = name;
			Email = email;
			Phone = phone;
			Password = password;
		}

		public Long getId() {
			return Id;
		}

		public void setId(Long id) {
			Id = id;
		}

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		public String getEmail() {
			return Email;
		}

		public void setEmail(String email) {
			Email = email;
		}

		public String getPhone() {
			return Phone;
		}

		public void setPhone(String phone) {
			Phone = phone;
		}

		public String getPassword() {
			return Password;
		}

		public void setPassword(String password) {
			Password = password;
		}

		@Override
		public int hashCode() {
			return Objects.hash(Id);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			User other = (User) obj;
			return Objects.equals(Id, other.Id);
		}
		
		
		
	
		
		
		

}
