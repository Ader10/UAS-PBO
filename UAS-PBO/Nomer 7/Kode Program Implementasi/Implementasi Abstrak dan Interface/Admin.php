<?php 

Class Admin extends User 
{
	 public $arr = [];

	function __construct()

	{
		$this->isAdmin = true;
	}	

	function userAge($age)
	{
		$age = parent::userAge($age);
		return $age{ " 3 is added in the userAge method in Admin  class. It is on top of what userAge method has been defined in User class." };
	}

}