/*
 * Copyright (c) 2016. . The Km2Labs Project
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *
 */

package com.km2labs.expenseview.database.entity;

import lombok.Getter;
import lombok.Setter;
import org.pojomatic.Pojomatic;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Subham Tyagi
 * On 6/12/2015.
 * <p>
 * TODO: Add class comments
 */
@MappedSuperclass
@Getter
@Setter
public class AbstractEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private long id;


    @Override
    public boolean equals(Object o) {
        return Pojomatic.equals(this, o);

    }

    @Override
    public int hashCode() {
        return Pojomatic.hashCode(this);
    }

    @Override
    public String toString() {
        return Pojomatic.toString(this);

    }

    public AbstractEntity setId(long id) {
        this.id = id;
        return this;
    }
}
