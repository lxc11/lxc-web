package com.lxxc.dao.base;


public interface IBaseDao<T> {
	
    /**
     * 根据主键 返回记录
     * @param seq
     * @return
     */
    <K> T selectByPrimaryKey(K seq);
}
