package com.tasktoys.matsuya.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Takumi on 2016/05/04.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="kaiki")
public class Kaiki {
    @Id
    private long id;
    private String tilte;
    //private List<Seki> sekiList;
    private String date;//yyyy-mm-dd形式

}
