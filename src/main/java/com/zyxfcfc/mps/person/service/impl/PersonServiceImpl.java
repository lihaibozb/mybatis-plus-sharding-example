package com.zyxfcfc.mps.person.service.impl;

import com.zyxfcfc.mps.person.entity.Person;
import com.zyxfcfc.mps.person.mapper.PersonMapper;
import com.zyxfcfc.mps.person.service.IPersonService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-07-11
 */
@Service
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements IPersonService {

}
