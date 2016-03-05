package com.tasktoys.matsuya.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Takumi on 2016/03/07.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "utensils")
public class Utensil {
    @Id
    long id;
    String name;
    String utensilsType;
    String creatorsName;
}
