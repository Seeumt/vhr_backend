package org.javaboy.vhr.service;

import org.javaboy.vhr.mapper.MenuMapper;
import org.javaboy.vhr.model.Hr;
import org.javaboy.vhr.model.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MenuService {
    @Autowired
    private MenuMapper menuMapper;


    public List<Menu> getMenusByHrId() {
        return menuMapper.getMenusByHrId(((Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId());
    }

//    public List<Menu> getMenuByHrId1() {
//        menuMapper.getMenusByHrId((Hr)(SecurityContextHolder.getContext().getAuthentication().getPrincipal().
//                ));
//    }
}
