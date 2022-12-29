
<?php
include('User.php');
include('Admin.php');
include('Member.php');


$address = "Surabaya City";

$admin = new Admin();

$member = new Member();

print_r($admin->userAge(3));
echo "<br />";
print_r($member->userAge(4));
echo "<br />";
print_r($member->userAddress($address));


echo "<br />";
print_r($member->getUserId(4));

echo "<br />";
print_r($member->getUserName("Andiana"));
