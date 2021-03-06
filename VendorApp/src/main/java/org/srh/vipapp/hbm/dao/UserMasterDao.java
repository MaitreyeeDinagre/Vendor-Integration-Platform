package org.srh.vipapp.hbm.dao;

import java.util.List;

import org.srh.vipapp.hbm.dto.UserMaster;


/**
 * HBM DAO to perform task related to {@link UserMaster} entity.  <br/>
 * Date: 29 Nov 2018
 * @author Vivek
 */
public interface UserMasterDao {

	/**
	 * Gets the {@link UserMaster} entity with the given 'userId'.
	 * @param userId {@link Integer}
	 * @return userMaster {@link UserMaster}
	 */
	public UserMaster findById(int userId);

	/**
	 * Returns all the {@link UserMaster} entities from persistence database
	 * @return userMasterList {@link List<UserMaster>}
	 */
	public List<UserMaster> getAllUsers();

	/**
	 * Gets the {@link UserMaster} entity with the given 'username'.
	 * @param username {@link String}
	 * @return userMaster {@link UserMaster}
	 */
	public UserMaster findByUsername(String username);

}