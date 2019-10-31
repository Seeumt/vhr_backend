package org.javaboy.vhr.mapper;


import org.javaboy.vhr.model.Hr;
import org.javaboy.vhr.model.Menu;
import org.springframework.security.core.context.SecurityContextHolder;
import sun.plugin.liveconnect.SecurityContextHelper;

import java.util.List;

/**
 * Created by sang on 2017/12/28.
 */
public interface MenuMapper {

    List<Menu> getMenusByHrId(Long hrid);


    void getMenusByHrId(Hr principal);
}
