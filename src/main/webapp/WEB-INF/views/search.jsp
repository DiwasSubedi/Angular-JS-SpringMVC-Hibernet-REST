<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<div>
		
<br /> {{countdown}}
		<form name="SearchForm">
			First Name:<input type="text"
				placeholder="Enter First Name to search" ng-model="searchname"><br />
			<input type="submit" value="Search" ng-click="search(searchname)">
		</form>
	
</div>