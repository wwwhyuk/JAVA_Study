package PolymorphismTest3.domain.userinfo.dao.oracle;

import PolymorphismTest3.domain.userinfo.UserInfo;
import PolymorphismTest3.domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {

	@Override
	public void insert(UserInfo userinfo) {
		System.out.println("오라클 데이터 삽입");
	}

	@Override
	public void update(UserInfo userinfo) {
		System.out.println("오라클 데이터 수정");
	}

	@Override
	public void delete(UserInfo userinfo) {
		System.out.println("오라클 데이터 삭제");
	}
	
}
