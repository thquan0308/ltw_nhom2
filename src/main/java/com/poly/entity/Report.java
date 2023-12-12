package com.poly.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Report")
public class Report {
	@Id
	@Column(name = "groupP")
	String group;
	@Column(name = "sumP")
	Double sum;
	@Column(name = "countP")
	Long count;
	@Column(name = "minP")
	Double min;
	@Column(name = "maxP")
	Double max;
	@Column(name = "avgP")
	Double avg;
	
	
}
