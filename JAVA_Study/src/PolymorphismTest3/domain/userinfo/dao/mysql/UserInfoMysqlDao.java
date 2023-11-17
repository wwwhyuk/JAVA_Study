package PolymorphismTest3.domain.userinfo.dao.mysql;

import PolymorphismTest3.domain.userinfo.UserInfo;
import PolymorphismTest3.domain.userinfo.dao.UserInfoDao;

public class UserInfoMysqlDao implements UserInfoDao {

	@Override
	public void insert(UserInfo userinfo) {
		System.out.println("mysql 데이터 삽입");
	}

	@Override
	public void update(UserInfo userinfo) {
		System.out.println("mysql 데이터 수정");
	}

	@Override
	public void delete(UserInfo userinfo) {
		System.out.println("mysql 데이터 삭제");
	}
	
}
