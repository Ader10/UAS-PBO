<?php
abstract class User 
{
	public $name;
	public $age;
	public $address;


	protected $isAdmin = false;


	function userAge($age)
	{
		return $age*2;
	}

	function userAddress($address)
	{
		return $address;
	}
}