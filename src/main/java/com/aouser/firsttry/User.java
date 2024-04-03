package com.aouser.firsttry;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "getUser")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

  @Id
  private ObjectId id;
  private String firstName;
  private String lastName;
}
