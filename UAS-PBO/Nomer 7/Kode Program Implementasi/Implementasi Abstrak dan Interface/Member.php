<?php

include('UserInterface.php');

Class Member extends User implements UserInterface
{

	function userAge($age)
	{
		$memberAge = parent::userAge($age);
		return "Member age is  " . $memberAge;
	}

	function userAddress($address)
	{
		$memberAddress = parent::userAddress($address);
		return "Member Address " . $memberAddress . "  And the country is  " . "Indonesia";
	}

	public function getUserId($id)
	{
		return "User ID is  " . $id;
	}

	public function getUserName($name)
	{
		return "User name is  " . $name;
	}
}