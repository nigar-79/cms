package com.ns.cms.tos.common;

import com.ns.cms.base.entities.User;

public class Pagination {
	
	private String sortKey;
	
	private String sortDir;
	
	private int recordsPerPage;
	
	private int pageNo;
	
	private User currentLoggedInUser;

	/**
	 * 
	 */
	public Pagination() {
		super();
	}

	/**
	 * @return the sortKey
	 */
	public String getSortKey() {
		return sortKey;
	}

	/**
	 * @param sortKey the sortKey to set
	 */
	public void setSortKey(String sortKey) {
		this.sortKey = sortKey;
	}

	/**
	 * @return the sortDir
	 */
	public String getSortDir() {
		return sortDir;
	}

	/**
	 * @param sortDir the sortDir to set
	 */
	public void setSortDir(String sortDir) {
		this.sortDir = sortDir;
	}

	/**
	 * @return the recordsPerPage
	 */
	public int getRecordsPerPage() {
		return recordsPerPage;
	}

	/**
	 * @param recordsPerPage the recordsPerPage to set
	 */
	public void setRecordsPerPage(int recordsPerPage) {
		this.recordsPerPage = recordsPerPage;
	}

	/**
	 * @return the pageNo
	 */
	public int getPageNo() {
		return pageNo;
	}

	/**
	 * @param pageNo the pageNo to set
	 */
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	/**
	 * @return the currentLoggedInUser
	 */
	public User getCurrentLoggedInUser() {
		return currentLoggedInUser;
	}

	/**
	 * @param currentLoggedInUser the currentLoggedInUser to set
	 */
	public void setCurrentLoggedInUser(User currentLoggedInUser) {
		this.currentLoggedInUser = currentLoggedInUser;
	}
	
}
