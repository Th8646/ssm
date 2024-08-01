package com.wpt.spring.service;/**
 * @author wpt@onlying.cn
 * @date 2024/7/31 0:44
 */

import com.wpt.spring.dao.MemberDaoImpl;

/**
 * @projectName: spring
 * @package: com.wpt.spring.service
 * @className: MemberServiceImpl
 * @author: wpt
 * @description: TODO
 * @date: 2024/7/31 0:44
 * @version: 1.0
 */
public class MemberServiceImpl {
    private MemberDaoImpl memberDao;

    public MemberDaoImpl getMemberDao() {
        return memberDao;
    }

    public void setMemberDao(MemberDaoImpl memberDao) {
        this.memberDao = memberDao;
    }

    public void add() {
       // System.out.println("service中的add方法被调用");
        memberDao.add();
    }
}
