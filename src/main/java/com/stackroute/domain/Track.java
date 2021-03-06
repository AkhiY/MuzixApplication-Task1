package com.stackroute.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class Track {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private int id;
    private String Name;
    private String Comment;
}
