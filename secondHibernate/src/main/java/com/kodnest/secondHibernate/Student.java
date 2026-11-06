package com.kodnest.secondHibernate;

	import jakarta.persistence.Column;
	import jakarta.persistence.Entity;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;

	@Entity
	@Table(name = "student")
	public class Student {
		@Id
		@Column(name = "s_id")
		int id;
		@Column(name = "s_name")
		String name;
		@Column(name = "dep_id")
		int dep_id;
		@Column(name = "email_id")
		String email;
		
		public Student() {
			super();
		}
		public Student(int id, String name, int dep_id, String email) {
			super();
			this.id = id;
			this.name = name;
			this.dep_id = dep_id;
			this.email = email;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getDep_id() {
			return dep_id;
		}
		public void setDep_id(int dep_id) {
			this.dep_id = dep_id;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
	}
