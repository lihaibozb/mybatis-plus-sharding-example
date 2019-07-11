package com.zyxfcfc.mps.person.entity;

import com.zyxfcfc.mps.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2019-07-11
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Person extends BaseEntity {

    private static final long serialVersionUID=1L;

    private String name;

    private Integer age;

    private Integer mobile;


}
