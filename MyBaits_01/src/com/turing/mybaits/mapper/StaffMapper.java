package com.turing.mybaits.mapper;

import com.turing.mybaits.entity.Staff;

/**
 * Staff映射接口
 * @author administratoa
 *
 */
public interface StaffMapper {

	/**
	 * 根据编号查询员工
	 * @param id 编号
	 * @return 员工
	 */
	Staff getstaById(int id);
}
