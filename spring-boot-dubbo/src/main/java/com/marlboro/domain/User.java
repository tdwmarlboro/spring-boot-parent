package com.marlboro.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by tdw on 2019/12/5.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = -9107468026783055675L;

    private int id;
    private String userName;
    private String password;
}
