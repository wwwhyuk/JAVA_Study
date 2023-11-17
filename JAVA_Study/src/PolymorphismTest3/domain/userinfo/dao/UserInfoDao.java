package PolymorphismTest3.domain.userinfo.dao;

import PolymorphismTest3.domain.userinfo.UserInfo;

public interface UserInfoDao {
	public abstract void insert(UserInfo userinfo);
	public abstract void update(UserInfo userinfo);
	public abstract void delete(UserInfo userinfo);
}
