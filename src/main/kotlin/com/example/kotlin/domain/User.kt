package com.example.kotlin.domain

import lombok.EqualsAndHashCode
import lombok.Getter
import lombok.ToString
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table


@Entity
@Getter
@ToString
@EqualsAndHashCode
@Table(name = "User")
class User {

}