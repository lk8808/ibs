package com.tr.ibs.portal.service;

import java.util.List;
import java.util.Map;

import com.tr.ibs.entity.RespData;
import com.tr.ibs.portal.model.Menu;

public interface IMenuService {
	
	public Menu get(Integer id);
	
	public List<Menu> queryAllList();

	public List<Menu> queryMenusLevel1();
	
	public List<Menu> queryAuthMenusLevel1ByAppid(String appid);
	
	public List<Menu> queryMenusByParentid(String parentid);
	
	public List<Map<String, Object>> getMenuTree(String parentid);
	
	public List<Map<String, Object>> getAppMenuTree();
	
	public RespData queryMenus4Tree(Map<String, Object> map);
	
	public RespData save(Menu menu);
	
	public RespData del(String ids);
}